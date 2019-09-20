/*Ejercicio 03: excepciones

Crea un programa que pida al usuario introducir un número. El programa debe devolver un mensaje especificando si el número introducido por el usuario
es par o impar.
Además, el programa debe controlar la excepción si el usuario introduce texto en lugar de un valor numérico y debe pedir que ingrese nuevamente el
número. Esta acción se repetirá hasta que el usuario ingrese un número. El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.
*/


package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepcion_Repetir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean f=false;

        do {
            System.out.print("\nIngrese un número: ");

            try {
                num = input.nextInt();
                if (num%2==0) System.out.println("El numero ingresado es par");
                else    System.out.println("El numero ingresado no es par");
                f=true;
            }catch (InputMismatchException e){
                System.out.println("El valor introducido no es numérico. El programa se cerrará");
                input.nextLine();
            }

        }while (!f);

    }

}
