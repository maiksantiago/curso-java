public class PasarPorReferencia {

    public static void main(String[] args) {

        int[] edades = {10, 11, 12};
        System.out.println("Iniciamos el método main");

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edad[i] = " + edades[i]);
        }

        System.out.println("Antes de llamar al método test");
        test(edades);
        System.out.println("Después de llamar al método test");

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edad[i] = " + edades[i]);
        }

        System.out.println("Finaliza el método main con los datos del arreglo modificados!");

    }

    public static void test(int[] edadesArreglo) {

        System.out.println("iniciamos el método test");

        for (int i = 0; i < edadesArreglo.length; i++) {
            edadesArreglo[i] = edadesArreglo[i] + 20;
        }

        System.out.println("Finaliza el método test");

    }

}