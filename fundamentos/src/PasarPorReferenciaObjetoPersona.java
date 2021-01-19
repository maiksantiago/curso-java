class Persona {
    private String nombre;

    public String leerNombre() {
        return this.nombre;
    }

    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

}

public class PasarPorReferenciaObjetoPersona {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Miguel");

        System.out.println("Iniciamos el método main");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona modificada!");

    }

    public static void test(Persona persona) {

        System.out.println("iniciamos el método test");

        persona.modificarNombre("Ángel");

        System.out.println("Finaliza el método test");

    }

}