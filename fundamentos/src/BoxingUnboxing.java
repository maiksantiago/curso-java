public class BoxingUnboxing {

    public static void main(String[] args) {

        Integer enteroBoxing = Integer.valueOf(10); // Boxing, primitivo a objeto
        Integer enteroAutoBoxing = 10; // Auto Boxing, primitivo a objeto automático
        int enteroUnboxing = enteroBoxing.intValue(); // Unboxing, objeto a primitivo
        int enteroAutoUnboxing = enteroBoxing; // Auto Unboxing, objeto a primitivo automático

        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Boxing y Auto Boxing

        int suma = 0;

        for (Integer i : enteros) {
            if (i.intValue() % 2 == 0) { // Unboxing
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        suma = 0;

        for (Integer i : enteros) {
            if (i % 2 == 0) { // Auto Unboxing
                suma += i;
            }
        }
        System.out.println("suma = " + suma);

    }

}