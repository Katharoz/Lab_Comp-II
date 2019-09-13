package TP6;

public class CrearContraseñas {

    private int cantcar;
    String passwords = "";  //Se inicializa como no vacio.

    //Aqui se instancian los objetos
    public CrearContraseñas(int cantcar){
        this.cantcar = cantcar;
        for (int j = 0; j<cantcar; j++){
            switch((int) Math.floor(Math.random()*(3 - 1 + 1) + 1)) {           //Devuelve un numero aleatorio entre 1 y 3.
                case 1: this.passwords += mayuscula();   break;
                case 2: this.passwords += minuscula();   break;
                case 3: this.passwords += numero();  break;
            }
        }
    }



    public static char mayuscula(){
        return (char) Math.floor(Math.random() * (90 - 65 + 1) + 65);           //El rango del random devuelve los valores correspondientes en ASCII a las letras mayusculas.
    }

    public static char minuscula(){
        return (char) Math.floor(Math.random() * (122 - 97 + 1) + 97);          //El rango del random devuelve los valores correspondientes en ASCII a las letras minusculas.
    }

    public static int numero(){
        return (char) Math.floor(Math.random()*(9 + 1));                        //El rango del random devuelve los valores correspondientes en ASCII a los numeros.
    }


    //Se devuelve una contraseña.
    public String getContraseña(){
        return  this.passwords;
    }

    //Se devuelve el largo de la contraseña.
    public int getlargoCont(){
        return this.cantcar;
    }

    //Se devuelve si la contraseña es o no segura.
    public boolean getSeguro(){
        int nums=0, mayus=0, minus=0;                   //Un contador por tipo de caracter en la contraseña (mayusculas, minusculas, numeros).

        //Se controla cada contraseña caracter a caracter.
        for (int i=0;   i<cantcar;  i++){
            if (Character.isDigit(passwords.charAt(i))) nums+=1;            //Si el caracter es un numero, se aumenta el correspondiente contador.

            else if (Character.isUpperCase(passwords.charAt(i)))    mayus+=1;           //Si el caracter es una mayusculas, se aumenta el correspondiente contador.

            else minus+=1;                                              //Si el caracter es una minuscula, se aumenta el correspondiente contador.
        }

        //Se controla la condicion de seguridad, de cumplirse se devuelve verdadero.
        if (nums>=5 && mayus>=2 && minus>=1){
            return true;
        }else return false;
    }

}
