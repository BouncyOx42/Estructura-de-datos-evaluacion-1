package eva_1_5_arreglos;


public class Principal {

    
    public static void main(String[] args) {
        
        //Declaracion de arreglos 
        int adatos []= new int[10];
        //N --> # de elementos
        //0 --> 1er elemento
        //N - 1 --> último elemento
        System.out.println(adatos);
        System.out.println("For normal");
        for (int i = 0; i < adatos.length; i++) {
            adatos [i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < adatos.length; i++) {
            System.out.println(adatos[i]);
        }
        System.out.println("For Each");
        for (int x : adatos) {
            System.out.println(x);
        }
        
    }
    
}
