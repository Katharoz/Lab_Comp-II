package TP8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehiculo> listaVeh = new ArrayList<>();        //Se genera la lista de vehiculos.
        int x;

        do {

            x = Menues.menuPrincipal();         //Asignación a 'x' de alguna de las opciones validas.

            switch (x){

                case 1: Menues.crearCoche(listaVeh);    break;

                case 2: Menues.crearMoto(listaVeh);     break;

                case 3: Menues.listarVehiculos(listaVeh);   break;

                case 4: Menues.acelerarVehiculo(listaVeh);  break;

                case 5: Menues.frenarVehiculo(listaVeh);    break;

                case 6: Menues.verificarPlazas();   break;

                case 0: System.out.println("Hasta Luego");  break;

                default: System.out.println("ERROR, Opcion no valida.");
            }

            System.out.println("\n\nPrecione enter para continuar...");
            input.nextLine();

        }while (x!=0);

    }

}
