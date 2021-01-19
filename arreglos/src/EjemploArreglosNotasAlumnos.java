import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {

    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa 7 notas de los estudiantes de la clase de matemáticas:");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingresa 7 notas de los estudiantes de la clase de historia:");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingresa 7 notas de los estudiantes de la clase de lenguaje:");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = (sumNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje / claseLenguaje.length);

        System.out.println("El promedio de la clase de matemáticas es: " + promedioMatematicas);
        System.out.println("El promedio de la clase de historia es: " + promedioHistoria);
        System.out.println("El promedio de la clase de lenguaje es: " + promedioLenguaje);
        System.out.println("El promedio total del curso es: " + (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3);

        System.out.println("Ingresa el identificador del alumno (de 0 - 6):");
        int id = s.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id]) / 3;
        System.out.println("El promedio del alumno no. " + id + " es: " + promedioAlumno);

    }

}