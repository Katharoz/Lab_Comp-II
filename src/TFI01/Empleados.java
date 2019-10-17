package TFI01;

public class Empleados extends Personas {

    public double sueldo;

    public Empleados(){}

    public Empleados(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo() {
        return "Empleado";
    }

    @Override
    public String toString() {
        return "\nnombre: "+this.nombre+ "\nedad: " +this.edad+ "\nSueldo: " +this.sueldo;

    }
}
