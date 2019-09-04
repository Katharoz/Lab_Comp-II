package TP4;

public class UsoCuenta {

    public static void main(String[] args) {

        int res;

        RecibirDatos.CargarCuenta();

        do {

            try {
                System.out.println("\nPrecione Enter para continuar...");
                System.in.read();
            }catch (Exception e){}

            System.out.println( "\n" +
                                "¿Desea realizar alguna transacción?\n" +
                                "\tPara recargar saldo ingrese 1\n" +
                                "\tPara realizar un reintegro ingrese 2\n" +
                                "\tPara Mirar saldo ingrese 3\n" +
                                "\tPara ver información general de la cuenta ingrese 4\n" +
                                "\tPara realizar una transferencia ingrese 5\n" +
                                "\tPara salir ingrese 0");
            res = RecibirDatos.input.nextInt();

            switch (res){
                case 1: RecibirDatos.Opcion1(); break;

                case 2: RecibirDatos.Opcion2(); break;

                case 3: RecibirDatos.Opcion3(); break;

                case 4: RecibirDatos.Opcion4(); break;

                case 5: RecibirDatos.Opcion5(); break;

                case 0: System.out.println("Hasta Luego");  break;

                default:System.out.println("Error. Opción invalida");
            }
        }while (res!=0);
    }
}
