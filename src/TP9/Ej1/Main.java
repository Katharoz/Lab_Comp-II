package TP9.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Numeros> listNum = new ArrayList<>();
        int x;

        Menus.crearLista(listNum);

        do {

            x = Menus.opciones();

            switch (x){
                case 1: Menus.sumaNat(listNum);    break;
                case 2: Menus.sumaComp(listNum);   break;
                case 3: Menus.mostrarNat(listNum); break;
                case 4: Menus.mostrarComp(listNum);break;
                case 0: System.out.println("¡Hasta Luego!");    break;
                default: System.out.println("Opcion no valida elegida");
            }

        }while (x!=0);

    }

}
