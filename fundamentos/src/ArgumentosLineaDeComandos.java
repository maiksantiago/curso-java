public class ArgumentosLineaDeComandos {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Favor de ingresar argumentos o parámetros!");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento número " + i + ": " + args[i]);
        }

        /* Ejecutar por linea de comandos: */

        /* javac ArgumentosLineaDeComandos.java -encoding utf8
        java ArgumentosLineaDeComandos
        java ArgumentosLineaDeComandos miguel santiago
        java ArgumentosLineaDeComandos miguel santiago a b c */

    }

}