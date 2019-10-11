package Clases.ClaseSerializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escritura {

    public static void main(String[] args) {

        Personas[] personas = new  Personas[4];

        personas[0] = new Personas("Ana", 21987123);
        personas[1] = new Personas("Juan", 22987123);
        personas[2] = new Personas("Pedro", 23987123);
        personas[3] = new Personas("Maria", 24987123);

        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:\\Users\\alvar\\Downloads\\Personas.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
