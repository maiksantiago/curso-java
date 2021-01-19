import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {

        Persona luci = new Persona("Luci", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(luci);

        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(bea);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUBURBAN);
        suzuki.setConductor(lalo);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Pérez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);

        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }

}