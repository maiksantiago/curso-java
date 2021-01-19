public class EjemploEjecutarProgramaSO {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor(); // Esperamos hasta que se cierre el proceso
        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor!");
        System.exit(0);

    }

}