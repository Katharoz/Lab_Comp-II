package TP3;

/*Ejercicio 01:
Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100. El programa debe imprimir en consola todos los
valores almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados. (Debes utilizar el método random() de la clase Math para
poder rellenar los elementos del array.

BONUS: Verificar que el número no se repita.*/

//Esta es una versión alternativa del ejercicio 1, es más sencilla, pero no se utiliza Random.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_100_Sin_Random {

    public static void main(String[] args) {

        Integer[] array = new Integer[100];     //Se crea el arreglo vacio. De tipo Integer y no int para poder convertirlo en una lista más adelante.

        //Se carga el arreglo con elementos ordenados del 1 al 100.
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        List<Integer>   list = Arrays.asList(array);         //Se convierte el arreglo a una lista.
        Collections.shuffle(list);              //Se 'baraja' los elementos de la lista de manera aleatoria.

        //Se muestra el arreglo aleatorio por pantalla.
        for (int elemento : list) {
            System.out.print(elemento + " ");
        }

    }

}
