import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        // calendario.set(2020, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); // formato de 12 hrs.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a"); // formato de 24 hrs.
        String fechaConFormato = sdf.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);

    }

}