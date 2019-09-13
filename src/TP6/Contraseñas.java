package TP6;

import java.util.Scanner;

public class Contraseñas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Se ingresan los datos.
        System.out.print("Ingrese la cantidad de contraseñas a crear: ");
        int cantidad = input.nextInt();
        System.out.print("Cuantos caracteres por contraseña: ");
        int cant =input.nextInt();
        CrearContraseñas[] password = new CrearContraseñas[cantidad];       //Se crea un arreglo de objetos.

        //Se crea la cantidad de objetos "contraseña" que indico el usuario.
        for(int i = 0 ; i < cantidad ; i++) {
            password[i] = new CrearContraseñas(cant);
        }

        //Se imprime la lista con las contraseñas y los datos.
        System.out.println( "\nContraseñas\tCant. Caracteres\tNivel de Seguridad" +
                            "\n-----------------------------------------");
        for (int i=0;   i<cantidad; i++){
            if (password[i].getSeguro()){       //Se verifica si el password es o no seguro.
                System.out.println(password[i].getContraseña() + "\t\t" + password[i].getlargoCont() + "\t\tSegura");
            }else   System.out.println(password[i].getContraseña() + "\t\t" + password[i].getlargoCont() + "\t\tNo Segura");

        }

    }

}
