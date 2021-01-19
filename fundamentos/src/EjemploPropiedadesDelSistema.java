import java.util.Properties;

public class EjemploPropiedadesDelSistema {

    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + "Una nueva linea...");

        Properties p = System.getProperties();
        p.list(System.out);

    }

}