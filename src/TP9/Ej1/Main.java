package TP9.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Numero> listnum = new ArrayList<>();
        Menus.crearLista(listnum);

        int x = Menus.menuPrincipal();

        switch (x){
            case 1: Menus.sumaNaturales(listnum);   break;

            case 2: Menus.sumaComplejos(listnum);   break;
        }
    }

}
