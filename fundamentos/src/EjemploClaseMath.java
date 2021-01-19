public class EjemploClaseMath {

    public static void main(String[] args) {

        int absoluto = Math.abs(-3); // Devuelve el valor absoluto de un valor int
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2); // Devuelve el mayor de dos valores dobles
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2); // Devuelve el menor de dos valores dobles
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); // Redondea el número hacia arriba siempre
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); // Redondea el número hacia abajo siempre
        System.out.println("piso = " + piso);

        long redondear = Math.round(Math.PI); // Redondea el número hacia arriba o abajo, según sea el caso
        System.out.println("redondear = " + redondear);

        double exp = Math.exp(2); // Devuelve el número e de Euler elevado a la potencia de un valor doble
        System.out.println("exp = " + exp);

        double log = Math.log(10); // Devuelve el logaritmo natural (base e) de un valor doble
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3); // Devuelve el valor del primer argumento elevado a la potencia del segundo argumento
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5); // Devuelve la raíz cuadrada positiva redondeada correctamente de un valor doble
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90d);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("Seno de 90 = " + Math.sin(radianes));
        System.out.println("Coseno de 90 = " + Math.cos(radianes));

        radianes = Math.toRadians(180d);
        System.out.println("Coseno de 180 = " + Math.cos(radianes));

        radianes = Math.toRadians(0d);
        System.out.println("Coseno de 0 = " + Math.cos(radianes));

    }

}