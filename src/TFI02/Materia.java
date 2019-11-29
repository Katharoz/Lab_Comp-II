package TFI02;

import java.util.Iterator;
import java.util.TreeSet;

public class Materia implements Informacion{

    private String nomMat;
    private Profesor titular;
    private TreeSet<Estudiante> estudiantes = new TreeSet<>();

    public Materia(String nomMat) {
        this.nomMat = nomMat;
    }

    public void agregarEstudiante(String nombre, String apellido, int legajo){
        estudiantes.add(new Estudiante(nombre, apellido, legajo));
    }

    public void eliminarEstudiante(String nombre){
        Iterator<Estudiante> eliminar = estudiantes.iterator();
        while (eliminar.hasNext()){
            if (eliminar.next().getNombre().equals(nombre)){
                eliminar.remove();
                System.out.println(nombre+" fue eliminado");
            }
        }
    }

    public void modificarTitular(double basico, int antiguedad){

        Profesor titular = new Profesor(basico, antiguedad);

        this.titular = titular;
        System.out.println("Titular creado");
    }

    /*####################################Interfaz#####################################*/

    @Override
    public int verCantidad() {
        return estudiantes.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }

    /*##################################Getters/Setters#######################################*/

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public TreeSet<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(TreeSet<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nomMat='" + nomMat + '\'' +
                ", titular=" + titular +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
