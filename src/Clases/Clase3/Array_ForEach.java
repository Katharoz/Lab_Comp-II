package Clases.Clase3;

public class Array_ForEach {

    public static void main(String[] args) {

        int[][] Matriz = new int[3][3];

        for (int i=0;   i<3;    i++){
            for (int j=0;   j<3;    j++){
                Matriz[i][j] = (int)(Math.random()*100+1);
            }
        }

        for (int[] Fila:Matriz){
            for (int Elemento:Fila){
                    System.out.print("[" +(Elemento)+ "] ");
            }
            System.out.println();
        }

    }

}
