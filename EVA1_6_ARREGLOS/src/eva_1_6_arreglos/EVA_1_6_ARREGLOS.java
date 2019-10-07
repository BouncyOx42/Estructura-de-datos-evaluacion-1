package eva_1_6_arreglos;

public class EVA_1_6_ARREGLOS {

    public static void main(String[] args) {

        int aiDatos[];

        aiDatos = new int[100000000];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        aiDatos[4] = 5000;
        aiDatos[69] = 500;
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
        }
    }

}
