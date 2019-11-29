package TFI02;

import TP8.Menues;

import java.util.Iterator;
import java.util.TreeSet;

public class Carrera implements Informacion {

    private String nomCar;
    private TreeSet<Materia> materias = new TreeSet<>();


    public Carrera(String nomCar) {
        this.nomCar = nomCar;
    }

    public void agregarMateria(String nombre){
        materias.add(new Materia(nombre));
    }

    public void eliminarMateria(String nombre){
        Iterator<Materia> eliminar = materias.iterator();
        while (eliminar.hasNext()){
            if (eliminar.next().getNomMat().equals(nombre)){
                eliminar.remove();
                System.out.println(nombre+" fue eliminada");
            }
        }
    }

    public void encontrarMateria(String nombre){
        for (Materia materia : materias) {
            if (materia.getNomMat().equals(nombre)){
                int opc;
                do {

                    System.out.println(materia.toString() + " fue encontrado, ¿Desea eliminarla?" +
                            "\n1: Si" +
                            "\n2: No");

                    opc = Menues.mismatchException();
                    if (opc != 1 && opc != 2) {
                        System.out.println("Opcion invalida, intente nuevamente");
                    } else if (opc == 1) {
                        eliminarMateria(nombre);
                    }

                }while(opc==-1);
            }
        }
    }

    public void eliminarEstudiante(String nombre){
        for (Materia materia : materias) {
            materia.eliminarEstudiante(nombre);
        }
    }

    /*##################################Interfaz#######################################*/

    @Override
    public int verCantidad() {
        return materias.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }

    /*###################################Getters/Setters######################################*/

    public String getNomCar() {
        return nomCar;
    }

    public void setNomCar(String nomCar) {
        this.nomCar = nomCar;
    }

    public TreeSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(TreeSet<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nomCar='" + nomCar + '\'' +
                ", materias=" + materias +
                '}';
    }
}
