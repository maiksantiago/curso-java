public class EjemploStringMetodos {

    public static void main(String[] args) {

        String nombre = "Miguel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Miguel\") = " + nombre.equals("Miguel"));
        System.out.println("nombre.equals(\"miguel\") = " + nombre.equals("miguel"));
        System.out.println("nombre.equalsIgnoreCase(\"miguel\") = " + nombre.equalsIgnoreCase("miguel"));
        System.out.println("nombre.compareTo(\"Miguel\") = " + nombre.compareTo("Miguel"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('z') = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());

    }

}