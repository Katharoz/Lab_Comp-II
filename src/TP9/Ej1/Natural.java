package TP9.Ej1;

public class Natural extends Numeros{

    private int num;

    public Natural(int num){
        this.num = num;
    }

    /*--------------Metodos-Heredados--------------*/
    @Override
    String getNum() {
        return "" +num;
    }

    /*--------------Metodos-Implementados--------------*/
    @Override
    public int sumObj(int y) {
        return this.num;
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
