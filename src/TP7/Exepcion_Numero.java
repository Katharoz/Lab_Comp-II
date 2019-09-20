/*Ejercicio 01: excepciones

Crea un programa que pida al usuario introducir un número. El programa debe devolver un mensaje especificando si el número introducido por el usuario
es par o impar.
Además, el programa debe controlar la excepción si el usuario introduce texto en lugar de un valor numérico. En caso de introducir texto, se debe
advertir al usuario que “El valor introducido no es numérico. El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.
*/


package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepcion_Numero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número: ");

        try {
            num = input.nextInt();
            if (num%2==0) System.out.println("El numero ingresado es par");
            else    System.out.println("El numero ingresado no es par");
        }catch (InputMismatchException e){
            System.out.println("El valor introducido no es numérico. El programa se cerrará");
        }

    }

}
