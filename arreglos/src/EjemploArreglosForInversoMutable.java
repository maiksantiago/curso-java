import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total2 - 1 - i];
            arreglo[i] = inverso;
            arreglo[total2 - 1 - i] = actual;
            total--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {
                "Dispositivo Flash USB DataTraveler G4",
                "Samsung Galaxy S20",
                "SSD UV500 SATA",
                "ASUS ExpertBook B9450FA",
                "MacBook Pro 13",
                "MacBook Pro 16",
                "IPhone 11 Pro"
        };

        int total = productos.length;

        Arrays.sort(productos);

        arregloInverso(productos);
        // Collections.reverse(Arrays.asList(productos));

        for (int i = 0; i < total; i++) {
            System.out.println("indice " + i + ": " + productos[i]);
        }

    }

}