public class ArgumentosLineaDeComandosCalculadora {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("Favor de ingresar una operación (sum, res, mul o div) y dos números enteros!");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Los valores deben ser números enteros, vuelva a intentar!");
            System.exit(-1);
        }
        switch (operacion) {
            case "sum":
                resultado = a + b;
                break;
            case "res":
                resultado = a - b;
                break;
            case "mul":
                resultado = a * b;
                break;
            case "div":
                if (b == 0) {
                    System.err.println("No se puede dividir por zero!");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a + b;
        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);

        /* Ejecutar por linea de comandos: */

        /* javac ArgumentosLineaDeComandosCalculadora.java -encoding utf8
        java ArgumentosLineaDeComandosCalculadora
        java ArgumentosLineaDeComandosCalculadora sum 2 2
        java ArgumentosLineaDeComandosCalculadora res 2 2
        java ArgumentosLineaDeComandosCalculadora mul 2 2
        java ArgumentosLineaDeComandosCalculadora div 2 2 */

    }

}