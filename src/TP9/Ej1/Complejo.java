package TP9.Ej1;

public class Complejo extends Numero implements Operaciones {

    private int[] num;

    public Complejo(int a, int b){
        this.num[0] = a;
        this.num[1] = b;
    }

    @Override
    public int sumar() {
        return 0;
    }

    @Override
    public int restar() {
        return 0;
    }

    @Override
    public int multiplicar() {
        return 0;
    }

    @Override
    int[] getNum() {
        return this.num;
    }

    @Override
    int getTipo() {
        return 2;
    }
}
