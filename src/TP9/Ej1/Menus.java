package TP9.Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import TP8.Menues;

public class Menus {

    private static Scanner input = new Scanner(System.in);

    public static void crearLista(List<Numeros> listNum){
        int n;

        do {
            System.out.print("¿Cuantos elementos desea ingresar?: ");
            n = Menues.mismatchException();
        }while (n<0);

        for (int i=0;   i<n;    i++){
            System.out.println("" +
                    "Posicion " +(i+1)+ " - ¿Que desea crear?" +
                    "\n\t1: Natural." +
                    "\n\t2: Complejo.");

            int res = Menues.mismatchException();

            if (res==1) crearNatural(listNum);
            else if (res==2)    crearComplejo(listNum);
            else {
                System.out.println("Opcion invalida.");
                i--;
            }
        }





    }

    public static int opciones(){
        System.out.println("" +
                "¿Que operacion desea realizar?\n" +
                "1. Suma de todos los números naturales.\n" +
                "2. Suma de todos los números complejos.\n" +
                "3. Listado de número naturales ordenados de menor a mayor separados por una coma. \n" +
                "4. Listado de los números complejos.\n" +
                "0. Salir");

        int res = Menues.mismatchException();
        return res;
    }

    public static void sumaNat(List<Numeros> listNum){
        int totNat=0;

        for (Numeros a : listNum) {
            if (a.getNum().charAt(0)!='('){
                totNat += a.sumObj(1);
            }
        }

        System.out.println("\nEl total de la suma de los numeros naturales es " +totNat);

    }

    public static void sumaComp(List<Numeros> listNum){
        int totReal=0, totImag=0;

        for (Numeros a : listNum) {
            if (a.getNum().charAt(0)=='('){
                totReal += a.sumObj(1);
                totImag += a.sumObj(2);
            }
        }

        System.out.println("\nEl total de la suma de los numeros naturales es (" +totReal+ "," +totImag+ ")");

    }

    public static void mostrarNat(List<Numeros> listNum){

        for (Numeros a : listNum) {
            if (a.getNum().charAt(0)!='('){
                System.out.print(a.getNum()+ ", ");
            }
        }

    }

    public static void mostrarComp(List<Numeros> listNum){

        for (Numeros a : listNum) {
            if (a.getNum().charAt(0)=='('){
                System.out.print(a.getNum()+ "; ");
            }
        }

    }

    private static void crearNatural(List<Numeros> listNum){
        int nat;
        do {
            System.out.print("Ingrese natural: ");
            nat = Menues.mismatchException();
            if (nat>0){
                listNum.add(new Natural(nat));
                System.out.println("Natural creado exitosamente.");
            }else System.out.println("Valor no valido ingresado.");
        }while (nat<1);
    }

    private static void crearComplejo(List<Numeros> listNum){
        int real, imag;
        do {
            System.out.print("Ingrese parte real: ");
            real = Menues.mismatchException();
            System.out.print("Ingrese parte imaginaria: ");
            imag = Menues.mismatchException();

            if (real!=-1 && imag!=-1){
                listNum.add(new Complejo(real,imag));
                System.out.println("Complejo creado exitosamente.");
            }else System.out.println("Valor no valido ingresado.");
        }while (real==-1 || imag==-1);
    }

}
