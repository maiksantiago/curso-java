import java.util.Arrays;

public class EjemploArreglosForInverso {

    public static void main(String[] args) {

        // String[] productos = new String[7];
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

        /* productos[0] = "Dispositivo Flash USB DataTraveler G4";
        productos[1] = "Samsung Galaxy S20";
        productos[2] = "SSD UV500 SATA";
        productos[3] = "ASUS ExpertBook B9450FA";
        productos[4] = "MacBook Pro 13";
        productos[5] = "MacBook Pro 16";
        productos[6] = "IPhone 11 Pro"; */

        Arrays.sort(productos);

        System.out.println("---- Usando for ----");
        for (int i = 0; i < total; i++) {
            System.out.println("indice " + i + ": " + productos[i]);
        }

        System.out.println();
        System.out.println("---- Usando for inverso ----");
        for (int i = 0; i < total; i++) {
            System.out.println("indice " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }

        System.out.println();
        System.out.println("---- Usando for inverso 2 ----");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("indice " + i + " valor " + productos[i]);
        }

    }

}