package TP8;

public class Moto implements Vehiculo {

    private int vel_act;
    public static int plaza=2;
    public String tipo;

    public Moto(int vel_act){
        this.vel_act=vel_act;
        this.tipo = "Moto";
    }

    @Override
    public void acelerar(int velocidad) {

        if (this.vel_act + velocidad<=Velocidad_Maxima) {
            this.vel_act += velocidad;
            System.out.println("Se ha acelerado hasta los " +(this.vel_act)+ " km/H");
        }
        else System.out.println("No se pueden superar los " +Velocidad_Maxima+ "Km/h");
    }

    @Override
    public void frenar(int velocidad) {
        if (this.vel_act - velocidad > 0){
            this.vel_act -= velocidad;
            System.out.println("Se ha desacelerado hasta los " +(this.vel_act)+ "km/h");
        }
        else {
            this.vel_act = 0;
            System.out.println("La moto se ha detenido");
        }
    }

    @Override
    public int plazas() {
        return this.plaza;
    }

    @Override
    public String tipo() {
        return this.tipo;
    }

    @Override
    public int vel_act() {
        return this.vel_act;
    }

}
