/*Nombre del grupo: Tres Programadores
Integrantes:    Álvarez Julián
                Martinez Nicolás
                Mendoza Martín*/

package TP5;
import java.util.Scanner;

public class UsoFacultad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Facultad facultad = new Facultad("UTN", 5);

        System.out.println("Bienvenido al sistema de manejo de alumnos, ¿Que desea hacer?");
        int res;
        do {

            try {
                System.out.println("\nPrecione Enter para continuar...");
                System.in.read();
            }catch (Exception e){}

            System.out.println( "\tPara agregar alumnos ingrese 1\n" +
                                "\tPara Listar los alumnos de la facultad ingrese 2\n" +
                                "\tPara buscar un alumno ingrese 3\n" +
                                "\tPara Borrar un estudiante ingrese 4\n" +
                                "\tPara Modificar la nota promedio de un alumno ingrese 5\n" +
                                "\tPara verificar que un alumno asiste a la facultad, ingrese 6\n" +
                                "\tPara salir ingrese 0");

            res = sc.nextInt();
            switch (res){

                case 1: facultad.agregarEstudiantes();   break;

                case 2: facultad.listaEstudiantes(); break;

                case 3: facultad.buscarEstudiantes();  break;

                case 4: facultad.borrarEstudiante(); break;

                case 5: facultad.modNota();  break;

                case 6: facultad.asiste();  break;

                case 0: System.out.println("¡Hasta luego!");    break;

                default:System.out.println("ERROR, opcion ingresada no valida");
            }

        }while (res!=0);

    }

}
