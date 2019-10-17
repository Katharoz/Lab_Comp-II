package TFI01;

public class Espectadores extends Personas {

    private String fila;
    private int silla;

    public Espectadores(String nombre, int edad, String fila, int silla){
        this.nombre = nombre;
        this.edad = edad;
        this.fila = fila;
        this.silla = silla;
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }

    @Override
    public String toString() {
        return "" +this.nombre;
    }

    public String getButaca(){
        return null;
    }
}
