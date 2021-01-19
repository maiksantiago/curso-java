public class SentenciaForEach {

    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};

        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }

        System.out.println();

        String[] nombres = {"Miguel", "Angel", "Maria", "Paco", "Lalo", "Bea", "Pato", "Santiago"};

        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }

    }

}