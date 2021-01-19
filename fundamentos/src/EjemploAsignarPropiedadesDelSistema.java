import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {

    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            System.out.println();
            ps.list(System.out);
        } catch (Exception e) {
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }

    }

}