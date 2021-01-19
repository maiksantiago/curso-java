public class SentenciaIfElse {

    public static void main(String[] args) {

        float promedio = 7.9f;

        if (promedio >= 9.5) {
            System.out.println("Felicidades, excelente promedio!");
        } else if (promedio >= 8.5) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 7.5) {
            System.out.println("Regular, necesitas estudiar un poco más!");
        } else {
            System.out.println("Reprobado!");
        }

        System.out.println("Tu promedio es: " + promedio);

    }

}