package TP3;

/*Ejercicio03:
Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas.

Los datos para rellenar la matriz deben ser proporcionados por el usuario.
Una vez que se llene todo el arreglo de arreglos se debe mostrar la información en la consola de una forma clara.
BONUS: ordenar alfabéticamente el arreglo.*/

import javax.swing.*;
import java.util.Scanner;

public class Matriz_3x3_Datos_Personas {

    public static void main(String[] args) {

        int x,y;        //Se utilizan para el ordenamiento de la matriz.
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas desea ingresas al sistema?"));      //Define cuantas columnas tendra la matriz;
        String [][] Matriz = new String[3][n];
        String temp;           //Se crea un auxiliar que servira para el ordenamiento de los datos.
        Scanner sc = new Scanner(System.in);

        //Se carga la matriz. Invirtiendo el orden común de filas y columnas.
        for (int j=0;   j<n;    j++){
            System.out.println("Ingrese los datos de la persona " +(j+1)+ " (Nombre - DNI - Edad):");
            for (int i=0;   i<3;    i++){
                Matriz[i][j] = sc.next();
            }
        }

        //Se ordena la matriz utilizando ordenamiento burbuja.
        for (x=0;   x<n-1;    x++){
            for (y=x+1;   y<n;    y++){
                if (Matriz[0][x].compareTo(Matriz[0][y])>0){        //Se comparan los Strings de la primera fila unicamente (Nombres). Si el resultado es positivo, eso quiere decir que la posición actual debe intercambiarse con la siguiente.

                    //Se guardan los valores de la columna actual en un arreglo temporal, y se prosigue a intercambiar todos los valores de ambas columnas entre si.
                    for (int k=0;   k<3;    k++){
                        temp      = Matriz[k][x];
                        Matriz[k][x] = Matriz[k][y];
                        Matriz[k][y] = temp;
                    }
                }
            }
        }
        //Todo este ordenamiento lo pense y me salió a la primera, soy buenisimo :D

        //Se muestra la matriz.
        for (String[] Fila:Matriz) {
            for (String Elemento:Fila) {
                System.out.print("[" +Elemento+ "]\t\t\t");
            }
            System.out.println();
        }

    }

}
