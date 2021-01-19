public class WrapperBoolean {

    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primitivoBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = true;

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);
        System.out.println("objetoBoolean3 = " + objetoBoolean3);

        System.out.println("Comparando dos objetos Boolean: " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos objetos Boolean: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparando dos objetos Boolean: " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando dos objetos Boolean: " + (objetoBoolean == objetoBoolean3));

        boolean primitivoBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primitivoBoolean2 = " + primitivoBoolean2);

    }

}