package eva_1_7_copia_arreglos;

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
        System.out.println(aiDatos);
        aiCopia = aiDatos;
        System.out.println("Datos copiados");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.print("["+aiCopia[i]+"]");
        }
        System.out.println(aiCopia);
    }

}
