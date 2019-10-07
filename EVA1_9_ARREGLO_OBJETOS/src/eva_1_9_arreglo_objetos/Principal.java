package eva_1_9_arreglo_objetos;

public class Principal {

    public static void main(String[] args) {

        Prueba[] apArreglo = new Prueba[5];
        Prueba[] apCopia = new Prueba[5];
        System.out.println(apArreglo);
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i] = new Prueba();
            apArreglo[i].x = (int) (Math.random() *100)-1;
            System.out.println(apArreglo[i]);
        }
        System.out.println("");
        for (int i = 0; i < apCopia.length; i++) {
            apCopia[i] = new Prueba();
            apCopia[i].x = apArreglo[i].x;
            System.out.println("Copia "+i+" = "+apCopia[i]);
            System.out.println("Arreglo "+i+" = "+apArreglo[i]);
        }
    }
}

class Prueba {
    int x;
}
