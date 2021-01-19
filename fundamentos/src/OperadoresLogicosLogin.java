import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        /* String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "miguel";
        passwords[0] = "123456";
        usernames[1] = "admin";
        passwords[1] = "12345";
        usernames[2] = "angel";
        passwords[2] = "12345"; */

        String[] usernames = {"miguel", "admin", "angel"};
        String[] passwords = {"123456", "12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el usuario:");
        String usr = scanner.next();

        System.out.println("Ingresa la contraseña:");
        String pwd = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if ((usernames[i].equals(usr) && passwords[i].equals(pwd))) {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido: ".concat(usr).concat("!"));
        } else {
            System.out.println("El usuario o contraseña es incorrecto!");
            System.out.println("Lo siento, se requiere autenticación!");
        }

    }

}