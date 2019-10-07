package eva_1_12_matices;

public class Principal {

    public static void main(String[] args) {

        int Matriz[][] = new int[3][5];

        for (int i = 0; i < Matriz.length; i++) { //Filas
            for (int j = 0; j < Matriz[i].length; j++) { //Columnas
                
                Matriz[i][j] = (int) (Math.random() * 100) + 1;
                
            }
        }
        //imprimir la matriz
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print("["+Matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }

}
