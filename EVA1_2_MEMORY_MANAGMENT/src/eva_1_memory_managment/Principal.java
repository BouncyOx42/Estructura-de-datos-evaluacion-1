package eva_1_memory_managment;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Inicia main.");
        A();
        System.out.println("Termina main.");

    }

    public static void A() {

        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");

    }

    public static void B() {

        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }

    public static void C() {
        
        System.out.println("Inicia C");
        System.out.println("Termina C");
        
    }

}
