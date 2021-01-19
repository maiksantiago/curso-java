public class EjemploArreglosForOrdenamientoBurbuja {

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

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);

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

        sortBurbuja(productos);

        for (int i = 0; i < total; i++) {
            System.out.println("indice " + i + ": " + productos[i]);
        }

        System.out.println();

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice " + i + ": " + numeros[i]);
        }

    }

}