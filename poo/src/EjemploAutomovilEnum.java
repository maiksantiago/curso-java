public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueStatic(45);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(45));

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru nombre: " + tipo.getNombre());
        System.out.println("Tipo subaru descripción: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("El automóvil es pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("El automóvil es utilitario, de transporte de empresas");
            case HATCHBACK -> System.out.println("El automóvil es mediano, compacto y de aspecto deportivo");
            case PICKUP -> System.out.println("El automóvil es de doble cabina o camioneta");
            case SEDAN -> System.out.println("El automóvil es mediano");
            case STATION_WAGON -> System.out.println("El automóvil es grande, con maletero grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
            System.out.println();
        }

    }

}