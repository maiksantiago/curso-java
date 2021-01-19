public class SistemasNumericos {

    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; // Para indicar que es un número binario, agregamos 0b al inicio
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764; // Para indicar que es un número octal, agregamos un 0 al inicio
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHexadecimal = 0x1f4; // Para indicar que es un número hexadecimal, agregamos un 0x al inicio
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

    }

}