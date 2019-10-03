package TP8;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menues {
    private static Scanner input = new Scanner(System.in);
    private static int velocidad;
    private static int res;

    public static int menuPrincipal(){

        System.out.println(
                    "\n¿Que desea hacer?:" +
                    "\n1: Crear coche." +
                    "\n2: Crear moto." +
                    "\n3: Listar vehiculos." +
                    "\n4: Acelerar vehiculo." +
                    "\n5: Frenar vehiculo." +
                    "\n6: Verificar Plazas disponibles." +
                    "\n0: Salir");

        res = mismatchException();

        return res;
    }

    public static void crearCoche(List<Vehiculo> vehiculos){

        if (Coche.plaza>0){
            System.out.print("Ingrese velocidad inicial del vehiculo: ");
            velocidad = mismatchException();

            if (velocidad <=120 && velocidad >=0) {
                vehiculos.add(new Coche(velocidad));
                Coche.plaza--;
                System.out.println("Vehiculo " +(vehiculos.size())+ " creado exitosamente.");
            }
            else System.out.println("Velocidad no valida.");
        }
        else System.out.println("No quedan mas plazas disponibles para coches.");
    }

    public static void crearMoto(List<Vehiculo> vehiculos){

        if (Moto.plaza>0){
            System.out.print("Ingrese velocidad inicial del vehiculo: ");
            velocidad = mismatchException();

            if (velocidad <=120 && velocidad >=0){
                vehiculos.add(new Moto(velocidad));
                Moto.plaza--;
                System.out.println("Vehiculo " +(vehiculos.size())+ " creado exitosamente.");
            }
            else System.out.println("Velocidad invalida.");

        }
        else System.out.println("No quedan mas plazas disponibles para motos.");
    }

    public static void listarVehiculos(List<Vehiculo> vehiculos){

        System.out.println( "Nro.\tTipo\t\tVelocidad" +
                        "\n-----------------------------");
        for (int i=0;   i<vehiculos.size(); i++) {
            System.out.println((i+1)+ "\t\t" +vehiculos.get(i).tipo()+ "\t\t" +vehiculos.get(i).vel_act());
        }
    }

    public static void acelerarVehiculo(List<Vehiculo> vehiculos){
        System.out.println("Elija un vehiculo:");
        listarVehiculos(vehiculos);

        res = mismatchException();

        if (res>0 && res<=vehiculos.size()){
            System.out.print("¿Que velocidad desea acelerar?: ");
            velocidad = mismatchException();
            if (velocidad>0)    vehiculos.get(res-1).acelerar(velocidad);
            else System.out.println("Debe ser un NUMERO mayor que 0");

        }
        else System.out.println("El vehiculo elegido no existe.");
    }

    public static void frenarVehiculo(List<Vehiculo> vehiculos){
        System.out.println("Elija un vehiculo:");
        listarVehiculos(vehiculos);

        res = mismatchException();

        if (res>0 && res<=vehiculos.size()){
            System.out.print("¿Que velocidad desea frenar?: ");
            velocidad = mismatchException();
            if (velocidad>0)   vehiculos.get(res-1).frenar(velocidad);
            else System.out.println("Debe ser un NUMERO mayor que 0");
        }
        else System.out.println("El vehiculo elegido no existe.");
    }

    public static void verificarPlazas(){
        System.out.println("Plazas disponibles:" +
                "\nCoches: " +Coche.plaza +
                "\nMotos: " +Moto.plaza);
    }



    public static int mismatchException(){
        int var;
        try {
            var = input.nextInt();
        }catch (InputMismatchException e){
            var = -1;
            input.nextLine();
        }
        return var;
    }

}
