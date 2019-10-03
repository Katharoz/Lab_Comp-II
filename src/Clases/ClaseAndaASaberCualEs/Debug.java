package Clases.ClaseAndaASaberCualEs;

import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dos numeros a dividir: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("El resultado de " +a+ "/" +b+ " es: " +(a/b));

    }

}
