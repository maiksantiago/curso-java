package com.mashernandez.paquetes.jardin;

import com.mashernandez.paquetes.hogar.*;

import static com.mashernandez.paquetes.hogar.Persona.*;

public class EjemploPaquetes {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Miguel");
        p.setApellido("Santiago");
        p.setColorPelo(ColorPelo.NEGRO);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
        System.out.println("generoMujer = " + generoMujer);
        System.out.println("generoHombre = " + generoHombre);

    }

}