public class SentenciasBucleEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "tres tristes tigres tragaban trigo en un trigal";
        String palabra = "tr";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Se ha encontrado: " + cantidad + " veces la palabra '" + palabra + "' en la frase");

        /* String frase = "tres tristes tigres tragaban trigo en un trigal";

        char letra = 'g';
        int cantidad = 0;

        int max = frase.length();
        for (int i = 0; i < max; i++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            cantidad++;
        }
        System.out.println("Se ha encontrado: " + cantidad + " veces el carácter '" + letra + "' en la frase"); */
    }

}