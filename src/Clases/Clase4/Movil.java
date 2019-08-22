package Clases.Clase4;

public class Movil {

    private int tamañoPantalla, capacidad, stock;
    private double precio, camara;
    private String tipo;

    public Movil(int tamañoPantalla, int capacidad, double precio, int camara, String tipo, int stock){
        this.tamañoPantalla = tamañoPantalla;
        this.capacidad = capacidad;
        this.precio = precio;
        this.camara = camara;
        this.tipo = tipo;
        this.stock = stock;
    }

    public Movil(){
        this.tamañoPantalla = 12;
        this.tipo = "Huawey";
    }

    public String getInfo(){
        return  ("Tamaño de pantalla: " +tamañoPantalla+ "\n" +
                "Capacidad: " +capacidad+ "\n" +
                "Precio: " +precio+ "\n" +
                "Camara: " +camara+ "\n" +
                "Tipo: " +tipo+ "\n" +
                "Stock: " +stock);

    }

}
