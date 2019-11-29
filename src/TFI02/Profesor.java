package TFI02;

public class Profesor extends Personas{

    private double basico;
    private int antiguedad;

    public Profesor(double basico, int antiguedad) {
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(){
        double sueldo = (((10*this.basico)/100)*this.antiguedad)+this.basico;
        return sueldo;
    }

    @Override
    public void modificarDatos() {

    }
}
