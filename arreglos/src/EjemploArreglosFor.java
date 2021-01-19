import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Dispositivo Flash USB DataTraveler G4";
        productos[1] = "Samsung Galaxy S20";
        productos[2] = "SSD UV500 SATA";
        productos[3] = "ASUS ExpertBook B9450FA";
        productos[4] = "MacBook Pro 13";
        productos[5] = "MacBook Pro 16";
        productos[6] = "IPhone 11 Pro";

        Arrays.sort(productos);

        System.out.println("---- Usando for ----");
        for (int i = 0; i < total; i++) {
            System.out.println("indice " + i + ": " + productos[i]);
        }

        System.out.println();
        System.out.println("---- Usando foreach ----");
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }

        System.out.println();
        System.out.println("---- Usando while ----");
        int i = 0;
        while (i < total) {
            System.out.println("indice " + i + ": " + productos[i]);
            i++;
        }

        System.out.println();
        System.out.println("---- Usando do while ----");
        int j = 0;
        do {
            System.out.println("indice " + j + ": " + productos[j]);
            j++;
        } while (j < total);

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k * 3;
        }

        System.out.println();

        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }

    }

}