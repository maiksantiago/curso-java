public class PasarPorValor {

    public static void main(String[] args) {

        Integer i = 10; // int i = 10;
        System.out.println("iniciamos el método main con el valor de i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = " + i + ", se mantiene igual");

    }

    public static void test(Integer i /* int i */) {

        System.out.println("iniciamos el método test con el valor de i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con el valor de i = " + i);

    }

}