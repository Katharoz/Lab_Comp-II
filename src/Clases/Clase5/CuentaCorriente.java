package Clases.Clase5;

public class CuentaCorriente {

    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = (long)(Math.random()*100+1);
    }

    public void setIngreso(double saldo){
        this.saldo += saldo;
    }

    public void setRetiro(double saldo){
        if (this.saldo > saldo){
            this.saldo -= saldo;
        }else System.out.println("Error, saldo insuficiente.");;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getInfo(){
        return  "\n" +
                "Nombre de cuenta: " +nombreTitular+ "\n" +
                "Saldo: " +saldo+ "\n" +
                "Numero de cuenta: " +numeroCuenta;
    }

    public void transferencia(CuentaCorriente clienteReceptor, double monto){
        this.saldo -= monto;
        clienteReceptor.saldo += monto;
    }

}
