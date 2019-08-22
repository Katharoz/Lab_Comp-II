package Clases.Clase4;

import javax.swing.*;

public class Tienda {

    public static void main(String[] args) {

        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la pantalla:"));
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Capacidad:"));
        double precio = Integer.parseInt(JOptionPane.showInputDialog("Precio:"));
        int camara = Integer.parseInt(JOptionPane.showInputDialog("camara:"));
        String tipo = JOptionPane.showInputDialog("Tipo:");
        int stock = Integer.parseInt(JOptionPane.showInputDialog("Stock:"));

        Movil celular = new Movil(tamaño, capacidad, precio, camara, tipo, stock);
        Movil celular2= new Movil();
        System.out.println(celular.getInfo());
        System.out.println(celular2.getInfo());

    }

}
