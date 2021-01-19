import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        String variable = 7 == 5 ? "Es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double programacion = 0.0;
        double electronica = 0.0;
        double fisica = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la nota de Programación:");
        programacion = scanner.nextDouble();

        System.out.println("Ingresa la nota de Electrónica:");
        electronica = scanner.nextDouble();

        System.out.println("Ingresa la nota de Física:");
        fisica = scanner.nextDouble();

        promedio = (programacion + electronica + fisica) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 8 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);

    }

}