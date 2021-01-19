import java.util.Map;

public class EjemploVariablesDeEntorno {

    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno del sistema = " + varEnv);

        System.out.println("----- Listando variables de entorno del sistema -----");
        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        System.out.println();

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH"); // Path también puede ir en mayúsculas: PATH
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path"); // En este caso debe escribirse como está registrada la variable de entorno (Path), ya que el Map es más estricto y si lo escribimos en mayúscula (PATH) el valor es null
        System.out.println("path2 = " + path2);

        /* También podemos agregar una variable de entorno desde el terminal, por ejemplo: setx SALUDAR_HOLA "Hola amigos, que tal!" */

        /* String saludarHola = varEnv.get("SALUDAR_HOLA");
        System.out.println("saludarHola = " + saludarHola); */

    }

}