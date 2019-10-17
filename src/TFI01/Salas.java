package TFI01;

import java.util.List;

public class Salas {

    private int capacidad;
    private String pelicula;
    private String nombre;
    private List<Espectadores> espectadores;

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(List<Espectadores> espectadores) {
        if (this.capacidad >= espectadores.size()){
            this.espectadores = espectadores;
        }
        else System.out.println("La sala no tiene butacas suficientes para tantos espectadores");
    }

    public List<Espectadores> getEspectadores() {
        return espectadores;
    }

    public String toString(){
        return "Sala: " +this.capacidad+ ", " +this.pelicula+ ", " +this.nombre;
    }

}
