package TFI02;

import java.util.Iterator;
import java.util.TreeSet;

public class Facultad implements Informacion{

    private String nomFac;
    private TreeSet<Carrera> carreras = new TreeSet<>();

    public Facultad(String nombre){
        this.nomFac = nombre;
    }

    public void agregarCarrera(String nombre){
        carreras.add(new Carrera(nombre));
    }

    public void eliminarCarrera(String nombre){
        Iterator<Carrera> eliminar = carreras.iterator();
        while (eliminar.hasNext()){
            if (eliminar.next().getNomCar().equals(nombre)){
                eliminar.remove();
                System.out.println(nombre+" fue eliminada");
            }
        }
    }

    public void eliminarEstudiante(String nombre){

        for (Carrera carrera : carreras) {
            carrera.eliminarEstudiante(nombre);
        }

    }

    /*###################################Interfaz######################################*/

    @Override
    public int verCantidad() {
        return carreras.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }

    /*###################################Getters/Setters######################################*/

    public String getNomFac() {
        return nomFac;
    }

    public void setNomFac(String nomFac) {
        this.nomFac = nomFac;
    }

    public TreeSet<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(TreeSet<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nomFac='" + nomFac + '\'' +
                ", carreras=" + carreras +
                '}';
    }
}
