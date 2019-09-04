package TP5;

import java.util.ArrayList;

public class Estudiantes{

    private String nomEstudiante;
    private int nroEstudiante;
    private double notaMedia;

    public Estudiantes(String nomEstudiante, int nroEstudiante, double notaMedia){
        this.nomEstudiante = nomEstudiante;
        this.nroEstudiante = nroEstudiante;
        this.notaMedia = notaMedia;
    }

    public static void asistencia(ArrayList<Estudiantes> lista, String nombre) {
        boolean e=false;
        for(int i=0; i<lista.size(); i++) {
            if(lista.get(i).getName().compareTo(nombre)==0) {
                System.out.println ("El alumno " +(nombre)+ " asiste a las facultad.");
                e=true;
                break;
            }
            System.out.println(lista.get(i).getName());
        }
        if (!e)  System.out.println ("El alumno " +(nombre)+ " no asiste a la facultad.");
    }


    //Getters y Setters.

    public String getName (){
        return this.nomEstudiante;
    }

    public int getNroEstudiante(){
        return this.nroEstudiante;
    }

    public double getNotaMedia(){
        return this.notaMedia;
    }

    public void setNotaMedia(double notanueva){
        this.notaMedia = notanueva;
    }

}
