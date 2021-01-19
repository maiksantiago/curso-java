import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");
        String strFecha = sdf.format(fecha);
        System.out.println("strFecha = " + strFecha);

        long j = 0;

        for (int i = 0; i < 1000000; i++) {
            j += i;
        }

        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido durante el ciclo for = " + tiempoFinal);

    }

}