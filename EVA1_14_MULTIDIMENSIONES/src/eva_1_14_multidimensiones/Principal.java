package eva_1_14_multidimensiones;

public class Principal {

    public static void main(String[] args) {
        
        int multi1 [][] = new int [2][3];
        int multi2 [][];
        multi2 = new int [3][];
        multi2[0] = new int [10];
        multi2[1] = new int [100];
        multi2[2] = new int [24];
        
        for (int i = 0; i < multi2.length; i++) {
            for (int j = 0; j < multi2[i].length; j++) {
                multi2[i][j] = (int)(Math.random()*100);
            }
        }
        
        for (int i = 0; i < multi2.length; i++) {
            for (int j = 0; j < multi2[i].length; j++) {
                System.out.print("["+ multi2[i][j]+"]");
            }
            System.out.println("");
        }
    }

}
