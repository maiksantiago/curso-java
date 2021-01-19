public class Primitivos {

    public static void main(String[] args) {

        /* Primitivos enteros */
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("valor máximo de un tipo byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un tipo byte: " + Byte.MIN_VALUE + "\n");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("valor máximo de un tipo short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un tipo short: " + Short.MIN_VALUE + "\n");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("valor máximo de un tipo int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un tipo int: " + Integer.MIN_VALUE + "\n");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("valor máximo de un tipo long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un tipo long: " + Long.MIN_VALUE + "\n");

        var numeroVar = 9223372036854775807L;

        /* Primitivos reales */
        // float realFloat = 1.5e5f; // 150000.0
        float realFloat = 0.000015f; // 1.5e-5f
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("valor máximo de un tipo float: " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un tipo float: " + Float.MIN_VALUE + "\n");

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("valor máximo de un tipo double: " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un tipo double: " + Double.MIN_VALUE + "\n");

        var realVar = 3.1416f;
        System.out.println("realVar = " + realVar + "\n");

        /* Primitivos caracteres */
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        char espacio = ' '; // char espacio = '\u0020';
        char retroceso = '\b'; // Elimina un carácter hacia atrás
        char tabulador = '\t'; // Tabulador
        char saltoLinea = '\n'; // Salto de linea
        char retornoCarro = '\r'; // Elimina el texto hacia atrás

        System.out.println("tipo char corresponde en bytes a:" + System.lineSeparator() + Character.BYTES);
        System.out.println("tipo char corresponde en bits a: " + Character.SIZE);
        System.out.println("valor máximo de un tipo char: " + Character.MAX_VALUE);
        System.out.println("valor mínimo de un tipo char: " + Character.MIN_VALUE + "\n");

        /* Primitivos lógicos */
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3 - 2 == 1);
        System.out.println("esIgual = " + esIgual);

    }

}