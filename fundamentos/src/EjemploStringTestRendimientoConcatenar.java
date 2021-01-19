public class EjemploStringTestRendimientoConcatenar {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 = 20ms, 1000 = 20ms, 10000 = 471ms, 100000 = 18069ms
            // c += a + b + "\n"; // 500 = 61ms, 1000 = 81ms, 10000 = 325ms, 100000 = 7704ms
            sb.append(a).append(b).append("\n"); // 500 = 0ms, 1000 = 0ms, 10000 = 20ms, 100000 = 40ms
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);

    }

}