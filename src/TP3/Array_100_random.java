package TP3;

/*Ejercicio 01:
Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100. El programa debe imprimir en consola todos los
valores almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados. (Debes utilizar el método random() de la clase Math para
poder rellenar los elementos del array.

BONUS: Verificar que el número no se repita.*/

//En esta primera version se utiliza Random como indica el ejercicio.

import java.util.Arrays;

public class Array_100_random {

    public static void main(String[] args) {

        int[] array = new int[100];     //Se crea el arreglo vacio.
        Integer n;          //Variable de control.


        for (int i = 0; i < array.length; i++) {

            //Bucle donde a 'n' se le asigna un valor aleatoria entre 1 y 100, sin embargo, sólo sale de dicho bucble cuando el valor de n no coincide
            //con ningún otro valor  previo del arreglo.
            do {
                n = ((int)(Math.random() * 100 + 1));           //Random devuelve valores de tipo double, por lo que es necesaria su conversión a int.
            }while (Arrays.stream(array).anyMatch(n::equals));      //Se busca si el valor de algún elemento del array coincide con 'n'.

            array[i] = n;            //Una vez se tiene un número válido, se guarda dicho valor en el arreglo.
        }

        //Se muestra el arreglo aleatorio por pantalla.
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }

    }

}
