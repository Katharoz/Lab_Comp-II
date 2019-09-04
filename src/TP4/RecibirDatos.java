package TP4;

import java.util.Scanner;

public class RecibirDatos {

    public static final Scanner input = new Scanner(System.in);
    public static int nrocliente;
    public static double ingreso;
    public static CuentaCorriente[] Clientes = new CuentaCorriente[2];

    public static void CargarCuenta(){

        for (int i=0;   i<Clientes.length;  i++){
            System.out.print("\nIngrese nombre del titular de la cuenta " +(i+1)+ ": ");
            String nombreTitular = input.next();
            System.out.print("Ingrese saldo de cuenta 1: ");
            double saldo = input.nextDouble();
            Clientes[i] = new CuentaCorriente(nombreTitular, saldo);
        }
    }

    public static  void Opcion1(){
        System.out.print("¿A que cuenta desea ingresar saldo?: ");
        nrocliente = input.nextInt();
        if (nrocliente == 1 || nrocliente == 2){
            System.out.print("¿Cuál monto desea ingresar?: ");
            ingreso = input.nextDouble();
            Clientes[nrocliente-1].setIngreso (ingreso);
            System.out.println("\nSe ingresaron $" +(ingreso)+ " exitosamente a la cuenta " +nrocliente);
        }else System.out.println("\nError. Cuenta no valida");
    }

    public static void Opcion2(){
        System.out.print("¿A que cuenta desea ingresar saldo?: ");
        nrocliente = input.nextInt();
        if (nrocliente == 1 || nrocliente == 2){
            System.out.print("¿Cuál monto desea reintegrar?: ");
            ingreso = input.nextDouble();
            Clientes[nrocliente-1].setIngreso (ingreso);
            System.out.println("\nSe ingresaron $" +(ingreso)+ " exitosamente a la cuenta " +nrocliente);
        }else System.out.println("\nError. Cuenta no valida");
    }

    public static void Opcion3(){
        System.out.print("¿De que cuenta desea revisar el saldo?: ");
        nrocliente = input.nextInt();
        if (nrocliente == 1 || nrocliente == 2){
            System.out.println("\nSaldo cuenta 1: " +Clientes[nrocliente-1].getSaldo());
        }else System.out.println("\nError. Cuenta no valida");
    }

    public static void Opcion4(){
        System.out.print("¿De que cuenta desea revisar la información?: ");
        nrocliente = input.nextInt();
        if (nrocliente == 1 || nrocliente == 2) {
            System.out.println("\nInformacion de cuenta " +(nrocliente)+ ": " + Clientes[nrocliente - 1].getInfo());
        } else System.out.println("\nError. Cuenta no valida");
    }

    public static void Opcion5(){
        System.out.print("¿Desde que cuenta va a realizar la transferencia?: ");
        int emisor = input.nextInt();
        System.out.print("¿A que cuenta desea enviar dinero?: ");
        int receptor = input.nextInt();
        System.out.print("¿Qué monto desea transferir?: ");
        int monto = input.nextInt();
        Clientes[emisor-1].transferencia(Clientes[receptor-1], monto);
    }

}
