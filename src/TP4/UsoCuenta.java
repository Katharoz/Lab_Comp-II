package TP4;

import java.util.Scanner;

public class UsoCuenta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCorriente[] Clientes = new CuentaCorriente[2];
        int res, nrocliente;
        double ingreso;

        for (int i=0;   i<Clientes.length;  i++){
            System.out.print("Ingrese nombre del titular de la cuenta " +(i+1)+ ": ");
            String nombreTitular = sc.next();
            System.out.print("Ingrese saldo de cuenta 1: ");
            double saldo = sc.nextDouble();
            Clientes[i] = new CuentaCorriente(nombreTitular, saldo);
        }

        do {

            try {
                System.out.println("\nPrecione Enter para continuar...");
                System.in.read();
            }catch (Exception e){}

            System.out.println( "\n" +
                                "¿Desea realizar alguna transacción?\n" +
                                "\tPara recargar saldo ingrese 1\n" +
                                "\tPara realizar un reintegro ingrese 2\n" +
                                "\tPara Mirar saldo ingrese 3\n" +
                                "\tPara ver información general de la cuenta ingrese 4\n" +
                                "\tPara realizar una transferencia ingrese 5\n" +
                                "\tPara salir ingrese 0");
            res = sc.nextInt();

            switch (res){
                case 1:{
                        System.out.println("¿A que cuenta desea ingresar saldo?");
                        nrocliente = sc.nextInt();
                        if (nrocliente == 1 || nrocliente == 2){
                            System.out.println("¿Cuál monto desea ingresar?: ");
                            ingreso = sc.nextDouble();
                            Clientes[nrocliente-1].setIngreso (ingreso);
                            System.out.println("Se ingresaron $" +(ingreso)+ " exitosamente a la cuenta " +nrocliente);
                        }else System.out.println("Error. Cuenta no valida");
                        break;
                }

                case 2:{
                    System.out.println("¿A que cuenta desea ingresar saldo?");
                    nrocliente = sc.nextInt();
                    if (nrocliente == 1 || nrocliente == 2){
                        System.out.println("¿Cuál monto desea reintegrar?: ");
                        ingreso = sc.nextDouble();
                        Clientes[nrocliente-1].setIngreso (ingreso);
                        System.out.println("Se ingresaron $" +(ingreso)+ " exitosamente a la cuenta " +nrocliente);
                    }else System.out.println("Error. Cuenta no valida");
                    break;
                }

                case 3:{
                        System.out.println("¿De que cuenta desea revisar el saldo?");
                        nrocliente = sc.nextInt();
                        if (nrocliente == 1 || nrocliente == 2){
                            System.out.println("Saldo cuenta 1: " +Clientes[nrocliente-1].getSaldo());
                        }else System.out.println("Error. Cuenta no valida");
                        break;
                }

                case 4:{
                        System.out.println("¿De que cuenta desea revisar la información?");
                        nrocliente = sc.nextInt();
                        if (nrocliente == 1 || nrocliente == 2) {
                            System.out.println("Informacion de cuenta " +(nrocliente)+ ": " + Clientes[nrocliente - 1].getInfo());
                        } else System.out.println("Error. Cuenta no valida");
                        break;
                }

                case 5:{
                        System.out.print("¿Desde que cuenta va a realizar la transferencia?: ");
                        int emisor = sc.nextInt();
                        System.out.print("¿A que cuenta desea enviar dinero?: ");
                        int receptor = sc.nextInt();
                        System.out.print("¿Qué monto desea transferir?: ");
                        int monto = sc.nextInt();
                        Clientes[emisor-1].transferencia(Clientes[receptor-1], monto);
                        break;
                }

                case 0: System.out.println("Hasta Luego");  break;

                default:    System.out.println("Error. Opción invalida");

            }

        }while (res!=0);




    }

}
