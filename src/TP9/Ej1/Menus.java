package TP9.Ej1;

import java.util.List;
import TP8.Menues;

public class Menus {

    public static void crearLista(List<Numero> list){
        int res;

        do {
            System.out.print("¿Cuantos elementos desea crear?: ");
            res = Menues.mismatchException();
        }while (res<1);

        for (list.size();   list.size()<res;){
            System.out.println(
                    "\n¿Que desea crear?" +
                    "\n1: Natural." +
                    "\n2:Complejo.");

            int x = Menues.mismatchException();

            if (x==1)   crearNatural(list);
            else if (x==2)  crearComplejo(list);
            else System.out.println("Opcion no valida.");
        }

    }

    public static int menuPrincipal(){
        System.out.println(
                "\n¿Que desea hacer?" +
                "\n1: Sumar todos los numeros naturales." +
                "\n2: Sumar todos los numeros complejos." +
                "\n3: Listar los numeros naturales." +
                "\n4: Listar los numeros complejos.");

        int res = Menues.mismatchException();
        return res;
    }

    public static void sumaNaturales(List<Numero> list){
        int acum=0;
        for (Numero a:list) {
            if (a.getTipo()==1){
                acum += a.getNum()[0];
            }
        }
        System.out.println("La suma de todos los naturales es: " +acum);
    }

    public static void sumaComplejos(List<Numero> list){
        int acumA=0, acumB=0;
        for (Numero a:list) {
            if (a.getTipo()==2){
                acumA += a.getNum()[0];
                acumB += a.getNum()[1];
            }
        }
        System.out.println("La suma de todos los complejos es: (" +acumA+ "," +acumB+ ")");
    }


    //-----------Crear-Numeros---------------//

    public static void crearNatural(List<Numero> list){
        System.out.print("Ingrese un numero natural: ");
        int numero = Menues.mismatchException();
        if (numero>0){
            list.add(new Natural(numero));
            System.out.println("Natural guardado en la posicion " +list.size());
        }
        else System.out.println("Numero no natural ingresado.");
    }

    public static void crearComplejo(List<Numero> list){
        System.out.println("Ingrese las dos partes de un numero complejo (a,b): ");
        int a = Menues.mismatchException();
        int b = Menues.mismatchException();
        if (a!=-1 && b!=-1){
            list.add(new Complejo(a, b));
            System.out.println("Complejo guardado en la posicion " +list.size());
        }
        else System.out.println("ERROR, alguno de los datos no es un numero.");
    }

}
