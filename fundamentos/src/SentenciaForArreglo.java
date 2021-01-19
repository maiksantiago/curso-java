import java.util.Scanner;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = {"Miguel", "Angel", "Maria", "Paco", "Lalo", "Bea", "Pato", "Santiago"};

        int count = nombres.length;
        for (int i = 0; i <= count - 1; i++) {
            if (nombres[i].toLowerCase().contains("MIGUEL".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("SANTIAGO".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        /* for (int i = 0; i < count; i++) {
            if (nombres[i].equals("Miguel") || nombres[i].equals("Santiago")) {
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        } */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre, ejemplo \"Miguel\" o \"Santiago\":");
        String buscar = scanner.next();
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres iterados = " + nombres[i]);
        }

        if (encontrado) {
            System.out.println(buscar.concat(" fue encontrado!"));
        } else {
            System.out.println(buscar.concat(" no fue encontrado!"));
        }
    }

}