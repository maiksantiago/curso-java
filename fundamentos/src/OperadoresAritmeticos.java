public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int i = 5, j = 4;

        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int divisionInt = i / j;
        float divisionFloat = (float) i / (float) j;
        System.out.println("divisionInt = " + divisionInt);
        System.out.println("divisionFloat = " + divisionFloat);

        int resto = i % j;
        System.out.println("resto = " + resto);
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = 7;
        if (numero % 2 == 0) {
            System.out.println("El número: " + numero + " es par!");
        } else {
            System.out.println("El número: " + numero + " es impar!");
        }

    }

}