package Clases.Clase6;

public class Padre extends Abuelo{

    public Padre(String nombre, String genero, int edad){
        super(nombre, genero, edad);
    }

    public void cambiarSexo(){
        if (super.genero == "M"){
            super.genero = "F";
        }else super.genero = "M";
    }

}
