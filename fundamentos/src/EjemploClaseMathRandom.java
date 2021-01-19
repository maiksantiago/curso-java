import java.util.Random;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {

        String[] colores = {"Azul", "Amarillo", "Rojo", "Verde", "Blanco", "Negro"};
        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObject = new Random();
        int randomInt = 15 + randomObject.nextInt(25 - 15 + 1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObject.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

    }

}