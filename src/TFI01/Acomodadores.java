package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores {

    private Salas sala;

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setSueldo(double sueldo) {
        super.sueldo = sueldo;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public Salas getSala() {
        return null;
    }

    public String toString(){
        return "\nnombre: "+this.nombre+ "\nedad: " +this.edad+ "\nSala: " +this.sala+ "\nSueldo: " +this.sueldo;
    }
}
