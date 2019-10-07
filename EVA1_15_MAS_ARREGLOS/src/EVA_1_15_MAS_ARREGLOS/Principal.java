package EVA_1_15_MAS_ARREGLOS;

public class Principal {

    public static void main(String[] args) {

        int iNume = 10;
        System.out.println("Valor = " + iNume);
        incrementa(iNume);
        System.out.println("Valor = " + iNume);
        //---
        prueba obj = new prueba();
        obj.iVal = 10;
        
        System.out.println("Valor = " + obj.iVal);
        incrementaprueba(obj);
        System.out.println("Valor = " + obj.iVal);
    }

    public static void incrementa(int iVal) {
        iVal++;
        System.out.println("Valor = " + iVal);
    }
    public static void incrementaprueba(prueba obj) {
        obj.iVal++;
        System.out.println("Valor = " + obj.iVal);
    }
}

class prueba {

    int iVal;
}
