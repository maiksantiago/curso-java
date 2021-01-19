public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueStatic(45);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setRuedas(null);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setRuedas(null);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setRuedas(null);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);
        nissan2.setRuedas(null);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Color patente = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litro = " + Automovil.calcularConsumoStatic(300, 600));
        System.out.println("Velocidad máxima en carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima en ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru nombre = " + tipo.getNombre());
        System.out.println("Tipo subaru descripción = " + tipo.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));

    }

}