package TP5;
import java.util.ArrayList;
import java.util.Scanner;

public class Facultad {

    public static final Scanner sc = new Scanner(System.in);                //}
    public static int contAlumnos =0;                                       // } Creación de variables globales que serán utilizadas en distintos metodos de la clase.
    public static int temp;                                                 //}

    private String nomColegio;                                               //
    private int nroEstudiantes;                                              //Variables de la clase Facultad.

    public static ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();               //Lista que manejará los alumnos.

    public Facultad(){}

    //Constructor.
    public Facultad(String nomColegio, int nroEstudiantes){
        this.nomColegio = nomColegio;
        this.nroEstudiantes = nroEstudiantes;
    }



    public void agregarEstudiantes(){
        char res = 's';                                 //Respuesta que sirve para salir del búcle.

        while (res != 'n' && res != 'N' && contAlumnos <nroEstudiantes){        //Se sale del búcle cuando la respuesta es  "No" o cuando ya se llenaron todos los cupos de alumnos.

            System.out.print("\nIngrese nombre de estudiante: ");
            String nombre = sc.next();
            System.out.print("Ingrese nota media: ");
            double nota = sc.nextDouble();
            listaEstudiantes.add(new Estudiantes(nombre, (contAlumnos +1), nota));               //Se crea un estudiante con los datos ingresados y un número de estudiante consecutivo y no repetido.
            System.out.print("¿Desea continuar? (S/N): ");
            res = sc.next().charAt(0);
            contAlumnos +=1;                            //Se incrementa el contador, indicando que se pasa al siguiente alumno.

        }

        //Se informa si quedan o no cupos.
        System.out.println("\n¡Todos los alumnos ingresados exitosamente!");
        if (contAlumnos == nroEstudiantes) System.out.println("Todos los cupos han sido ocupados");
        else System.out.println("Quedan disponibles " +(nroEstudiantes- contAlumnos)+ " cupos");

    }



    //Se listan todos los estudiantes que fueron cargados.
    public void listaEstudiantes(){
        System.out.println( "Nombre\t\t\tNota media\t\t\tNro de Estudiante" +
                            "\n------------------------------------------------------");
        for (int i = 0; i< contAlumnos; i++){
            System.out.println(listaEstudiantes.get(i).getName()+ "\t\t\t" + listaEstudiantes.get(i).getNotaMedia()+ "\t\t\t\t\t" + listaEstudiantes.get(i).getNroEstudiante());
        }
    }



    public boolean buscarEstudiantes(){
        boolean f = false;

        System.out.print("Ingrese el nombre del alumno que desea buscar: ");                        //Se pide el nombre a buscar.
        String nombre = sc.next();

        //Se recorre toda la lista.
        for (int i = 0; i< listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getName().compareTo(nombre)==0){                            //Se compara cada nombre con el dado para la busqueda. De encontrar una coincidencia, se muestran los datos de ese alumno.
                System.out.println( "\nDatos del Estudiante:" +
                                    "\nNombre: \t\t\t" + listaEstudiantes.get(i).getName() +
                                    "\nNro de Estudiante: \t" + listaEstudiantes.get(i).getNroEstudiante() +
                                    "\nNota media: \t\t" + listaEstudiantes.get(i).getNotaMedia());

                f = true;                       //Tambien se cambia el valor booleano a verdadero.
                temp = i;                       //Se guarda la posicion en la lista del nombre encontrado.
                break;
            }
        }
        if (!f) System.out.println("No se ha encontrado un alumno con el nombre '" +(nombre)+ "'");
        return f;
    }



    public void borrarEstudiante(){
        if (buscarEstudiantes()){                                                                   //De ser verdadero, significa que se encontro un alumno con el nombre dado, por lo que se puede borrar.
            listaEstudiantes.remove(temp);                                                                  //Se procede a borrar el alumno encontrado en la posición guardada en 'temp'.
            System.out.println("Estudiante '" +(listaEstudiantes.get(temp-1).getName())+ "' removido");
            contAlumnos--;                                                                                              //Se resta uno a la cantidad actual de estudiantes.
        }
    }



    public void modNota(){
        if (buscarEstudiantes()){                                   //De ser verdadero, significa que se encontro un alumno con el nombre dado, por lo que se puede modificar.
            System.out.print("Ingrese la nueva nota: ");
            double nota = sc.nextDouble();
            listaEstudiantes.get(temp).setNotaMedia(nota);                      //Se modifica la nota del estudiante encontrado en la posicion guardada en 'temp'.
        }
    }

    public void asiste(){
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = sc.next();

        Estudiantes.asistencia(listaEstudiantes, nombre);
    }


    //Getters

    public ArrayList<Estudiantes> getListaEstudiantes() {
        return listaEstudiantes;
    }
}
