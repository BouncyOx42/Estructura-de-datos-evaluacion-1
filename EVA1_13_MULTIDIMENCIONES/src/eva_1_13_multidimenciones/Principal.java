package eva_1_13_multidimenciones;


public class Principal {

    
    public static void main(String[] args) {
        
        int multi [][][][][] = new int[5][3][8][10][11];
        
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                for (int k = 0; k < multi[i][j].length; k++) {
                    for (int l = 0; l < multi[i][j][k].length; l++) {
                        for (int m = 0; m < multi[i][j][k][l].length; m++) {
                            multi[i][j][k][l][m] = (int)(Math.random()*100);
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                for (int k = 0; k < multi[i][j].length; k++) {
                    for (int l = 0; l < multi[i][j][k].length; l++) {
                        for (int m = 0; m < multi[i][j][k][l].length; m++) {
                            System.out.print("["+multi[i][j][k][l][m]+"]");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
