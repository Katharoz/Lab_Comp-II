package TFI01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Espectadores> listaEspec = new ArrayList<>();
        int x;
        Salas sala = null;
        Acomodadores acomod = null;
        Empleados emp = null;

        do {

            x = Cine.menuPrincipal();

            switch (x){

                case 1: Cine.cargarEspectador(listaEspec);    break;

                case 2: sala = Cine.crearSala();   break;

                case 3: Cine.asignarEspectadores(listaEspec, sala);   break;

                case 4: Cine.mostrarEspectadores(sala); break;

                case 5: acomod = Cine.crearAcomodador();    break;

                case 6: Cine.asignarAcomodador(sala, acomod);   break;

                case 7: Cine.sueldo(50000.00, acomod);  break;

                case 8: Cine.mostrarAcomodador(acomod); break;

                case 9: emp = Cine.crearEmpleado(); break;

                case 10: Cine.mostrarEmpleado(emp); break;

                case 0: System.out.println("Hasta Luego");  break;

                default: System.out.println("ERROR, Opcion no valida.");
            }

            System.out.println("\n\nPrecione enter para continuar...");
            input.nextLine();

        }while (x!=0);

    }

}
