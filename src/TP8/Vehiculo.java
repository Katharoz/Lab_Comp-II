package TP8;

public interface Vehiculo {

    int Velocidad_Maxima = 120;

    void acelerar(int velocidad);
    void frenar(int velocidad);
    int plazas();
    String tipo();
    int vel_act();

}
