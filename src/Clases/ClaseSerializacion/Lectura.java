package Clases.ClaseSerializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura {

    public static void main(String[] args) {

        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:\\Users\\alvar\\Downloads\\Personas.txt"));
            Personas[] personasEntrada = (Personas[]) entrada.readObject();

            for (Personas personas: personasEntrada) {
                System.out.println(personas.toString());
            }

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.getException();
        }

    }

}
