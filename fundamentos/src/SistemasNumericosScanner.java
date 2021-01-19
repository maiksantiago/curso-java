import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt(); // Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            System.out.println("Error: Se debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);

    }

}