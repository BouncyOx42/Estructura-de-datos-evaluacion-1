
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Personas[] apnom = new Personas[10];
        for (int i = 0; i < apnom.length; i++) {
            apnom[i] = new Personas();
            System.out.println("Ingresa el nombre de la persona");
            apnom[i].nombre = a.nextLine();

        }
        imprimir(apnom);
        //copia del arreglo
        Personas[] acopia = new Personas[apnom.length];
        for (int i = 0; i < apnom.length; i++) {
            acopia[i] = new Personas();
            acopia[i].nombre = apnom[i].nombre;
            System.out.println("nombre copia "+i+": "+acopia[i].nombre);
        }
                
    }

    public static void imprimir(Personas[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nombre "+i+": " + args[i].nombre);
        }
    }

}

class Personas {

    String nombre, apellido;
}
