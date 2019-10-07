package eva1_16_arreglos_valor_ref;

public class Principal {

    public static void main(String[] args) {
        int[] ma = new int[10];
        System.out.println(ma);
        llenarArreglo(ma);
        madrearArreglo(ma);
        System.out.println(ma);
        imprimirArreglo(ma);
    }

    public static void llenarArreglo(int[] arre) {
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 100);
        }
    }
    
    public static void madrearArreglo(int[] arre){
        arre = new int[100];
        System.out.println(arre);
    }

    public static void imprimirArreglo(int[] arre) {
        for (int i = 0; i < arre.length; i++) {
            System.out.print("[" + arre[i] + "]");
        }
        System.out.println("");
    }

}
