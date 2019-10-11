package TP9.Ej1;

public class Complejo extends Numeros{

    private int real, imag;

    public Complejo(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    /*--------------Metodos-Heredados--------------*/
    @Override
    String getNum() {
        return "(" +real+ "," +imag+ ")";
    }

    /*--------------Metodos-Implementados--------------*/
    @Override
    public int sumObj(int y) {
        if (y==1)   return this.real;
        else return this.imag;
    }

    @Override
    public int resObj() {
        return 0;
    }

    @Override
    public int multObj() {
        return 0;
    }

}
