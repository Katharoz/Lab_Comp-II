package TP9.Ej1;

public class Natural extends Numero implements Operaciones {

    private int[] num;

    public Natural(int num){
        this.num[0] = num;
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
        return 1;
    }
}
