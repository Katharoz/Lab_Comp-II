package TFI01;

import TP8.Menues;

import java.util.List;
import java.util.Scanner;

public class Cine {

    private static Scanner input = new Scanner(System.in);

    public static int menuPrincipal(){
        System.out.println("" +
                "\n¿Que desea hacer?" +
                "\n1: Cargar Espectadores" +
                "\n2: Crear Sala" +
                "\n3: Asignar Espectadores a sala" +
                "\n4: Mostrar Espectadores en sala" +
                "\n5: Crear Acomodador" +
                "\n6: Asignar acomodador a salas" +
                "\n7: Asignar 50000,00 al sueldo del acomodador" +
                "\n8: Mostrar los datos del acomodador" +
                "\n9: Crear un empleado" +
                "\n10:Mostrar los datos del empleado" +
                "\n0: Salir");

        int res = Menues.mismatchException();
        return res;
    }

    public static void cargarEspectador(List<Espectadores> espectadores){
        int x;

        do {
            System.out.println("" +
                    "¿Desea crear una persona?" +
                    "\n0: No" +
                    "\n1: Si");

            x = Menues.mismatchException();

            if (x==1){
                System.out.println("\nIngrese los datos de la persona:");
                System.out.print("\nNombre: ");
                String nombre = input.next();
                System.out.print("\nEdad: ");
                int edad = input.nextInt();
                System.out.print("\nFila: ");
                String fila = input.next();
                System.out.print("\nSilla: ");
                int silla = input.nextInt();

                espectadores.add(new Espectadores(nombre, edad, fila, silla));
            }

        }while (x!=0);

    }

    public static Salas crearSala(){
        System.out.println("\nIngrese datos de la sala:");
        System.out.print("\nNombre: ");
        String nombre = input.next();
        input.nextLine();
        System.out.print("\nCapacidad: ");
        int capacidad = input.nextInt();

        Salas sala = new Salas(capacidad, nombre);

        System.out.print("\n¿Cual pelicula se proyectara en la sala?: ");
        String pelicula = input.next();

        sala.setPelicula(pelicula);

        System.out.println("Sala creada");
        return sala;
    }

    public static void asignarEspectadores(List<Espectadores> espectadores, Salas sala){

        if (sala != null){
            sala.setEspectadores(espectadores);
        }else System.out.println("No existe ninguna sala aun");

    }

    public static void mostrarEspectadores(Salas sala){

        if (sala!=null) {
            List<Espectadores> espectador = sala.getEspectadores();

            for (Espectadores e : espectador) {
                System.out.println(e.toString());
            }
        }else System.out.println("Aun no se ha creado la sala");
    }

    public static Acomodadores crearAcomodador (){
        System.out.println("\nIngrese los datos del acomodador:");
        System.out.print("\nNombre: ");
        String nombre = input.next();
        System.out.print("\nEdad: ");
        int edad = input.nextInt();

        Acomodadores acomodador = new Acomodadores(nombre, edad);
        System.out.println("\nAcomodador creado");
        return acomodador;
    }

    public static void asignarAcomodador(Salas sala, Acomodadores acomodador){

        if (sala != null){
            acomodador.setSala(sala);
        }else System.out.println("No existe ninguna sala aun");
    }

    public static void sueldo(double sueldo, Acomodadores acomodador){
        acomodador.setSueldo(sueldo);
    }

    public static void mostrarAcomodador(Acomodadores acomodador){
        System.out.println(acomodador.toString());
    }

    public static Empleados crearEmpleado(){
        System.out.println("\nIngrese los datos del empleado:");
        System.out.print("\nNombre: ");
        String nombre = input.next();
        System.out.print("\nEdad: ");
        int edad = input.nextInt();


        Empleados empleado = new Empleados(nombre, edad);

        System.out.print("Sueldo: ");
        double sueldo = input.nextDouble();
        empleado.setSueldo(sueldo);

        System.out.println("\nEmpleado creado");
        return empleado;
    }

    public static void mostrarEmpleado(Empleados empleado){
        System.out.println(empleado.toString());
    }


}
