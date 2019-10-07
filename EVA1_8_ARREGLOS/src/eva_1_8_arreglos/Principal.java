package eva_1_8_arreglos;


public class Principal {

    
    public static void main(String[] args) {
        
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Datos originales");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i <aiDatos.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        
        ImprimirArreglo(aiDatos);
        ImprimirArreglo(aiCopia);
        System.out.println(aiDatos);
        System.out.println(aiCopia);
        aiDatos[0] = 9999;
        ImprimirArreglo(aiDatos);
        ImprimirArreglo(aiCopia);
    }
    
    public static void ImprimirArreglo (int[] asdf){
        System.out.println("");
        for (int i = 0; i < asdf.length; i++) {
            System.out.print("[" + asdf[i] + "]");
        }
        System.out.println("");
    }
    
}
