import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {

    public static void main(String[] args) {

        /*
            Ingresa un número: 1
            Ingresa un número: 2
            Ingresa un número: 3
            Ingresa un número: 4
            Ingresa un número: 5
            Ingresa un número: 6
            Ingresa un número: 7
            Ingresa un número: 8
            Ingresa un número: 9
            Ingresa un número: 10

            Resultado:
            10
            1
            2
            3
            4
            5
            6
            7
            8
            9
         */

        /* int[] a = new int[10];
        int ultimo;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        ultimo = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = ultimo;

        System.out.println("Resultado:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        } */

        /*
            Ingresa un número: 1
            Ingresa un número: 2
            Ingresa un número: 3
            Ingresa un número: 4
            Ingresa un número: 5
            Ingresa un número: 6
            Ingresa un número: 7
            Ingresa un número: 8
            Ingresa un número: 9

            Ingresa un nuevo elemento:
            500
            En que posición deseas agregar el elemento (de 0 - 9):
            5
            Resultado:
            1
            2
            3
            4
            5
            500
            6
            7
            8
            9
         */

        /* int[] a = new int[10];
        int elemento, posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingresa un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingresa un nuevo elemento:");
        elemento = s.nextInt();

        System.out.println("En que posición deseas agregar el elemento (de 0 - 9):");
        posicion = s.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("Resultado:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        } */

        /*
            Ingresa un número: 1
            Ingresa un número: 2
            Ingresa un número: 3
            Ingresa un número: 4
            Ingresa un número: 5
            Ingresa un número: 6
            Ingresa un número: 7
            Ingresa un número: 8
            Ingresa un número: 9
            Ingresa un número: 10

            Ingresa un nuevo elemento:
            100
            En que posición deseas agregar el elemento (de 0 - 9):
            7
            Resultado:
            1
            2
            3
            4
            5
            6
            7
            100
            8
            9
            10
         */

        /* int[] a = new int[10];
        int elemento, posicion, ultimo;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingresa un nuevo elemento:");
        elemento = s.nextInt();

        System.out.println("En que posición deseas agregar el elemento (de 0 - 9):");
        posicion = s.nextInt();

        ultimo = a[a.length - 1];
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
        a[posicion] = elemento;
        a[a.length - 1] = ultimo;

        System.out.println("Resultado:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        } */

        /*
            Ingresa un número: 2
            Ingresa un número: 4
            Ingresa un número: 6
            Ingresa un número: 8
            Ingresa un número: 10
            Ingresa un número: 12

            Ingresa un número para insertar:
            7
            Resultado (arreglo ordenado):
            0 => 2
            1 => 4
            2 => 6
            3 => 7
            4 => 8
            5 => 10
            6 => 12
         */

        /* int[] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingresa un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingresa un número para insertar:");
        numero = s.nextInt();

        posicion = 0;
        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("Resultado:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        } */

        /*
            Ingresa un número: 1
            Ingresa un número: 3
            Ingresa un número: 5
            Ingresa un número: 7
            Ingresa un número: 9
            Ingresa un número: 11
            Ingresa un número: 13

            Ingresa un número para insertar:
            8
            Resultado (arreglo ordenado):
            0 => 1
            1 => 3
            2 => 5
            3 => 7
            4 => 8
            5 => 9
            6 => 11
            7 => 13
         */

        int[] a = new int[7];
        int numero, posicion, ultimo;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingresa un número para insertar:");
        numero = s.nextInt();

        ultimo = a[a.length - 1];
        posicion = 0;
        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        if (numero > ultimo) {
            b[b.length - 1] = numero;
        } else {
            b[b.length - 1] = ultimo;
            b[posicion] = numero;
        }

        System.out.println("Resultado (arreglo ordenado):");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }

    }

}