import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingresa una fecha con formato 'yyyy-MM-dd':");

        try {
            Date fecha = sdf.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("sdf.format(fecha) = " + sdf.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("fecha (ingresada por el usuario) es después que fecha2 (fecha del sistema)!");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha (ingresada por el usuario) es anterior que fecha2 (fecha del sistema)!");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha (ingresada por el usuario) es igual que fecha2 (fecha del sistema)!");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("fecha (ingresada por el usuario) es después que fecha2 (fecha del sistema)!");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha (ingresada por el usuario) es anterior que fecha2 (fecha del sistema)!");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha (ingresada por el usuario) es igual que fecha2 (fecha del sistema)!");
            }
        } catch (ParseException e) {
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser: 'yyyy-MM-dd'");
            // System.exit(1);
            main(args);
        }

    }

}