/*Ejercicio 02: excepciones propias

Crea un programa que pida al usuario introducir un número entre 1 y 100. Si el usuario introduce un número fuera de ese rango el programa lanzará
una excepción propia. El mensaje de la excepción será “El nº está fuera de rango”.
*/


package TP7;

import java.util.Scanner;

public class Fuera_de_Rango {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número entre 1 y 100: ");

        try {
            num = input.nextInt();
            if (num>=1 && num<=100) System.out.println("El numero ingresado es: " + num);
            else    System.out.println("El nº está fuera de rango");
        }catch (Exception e){
            System.out.println("El caracter ingresado no es un numero");
        }


    }

}
