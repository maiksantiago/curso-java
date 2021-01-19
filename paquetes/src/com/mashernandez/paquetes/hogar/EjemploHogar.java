package com.mashernandez.paquetes.hogar;

import com.mashernandez.paquetes.jardin.Perro;

import static com.mashernandez.paquetes.hogar.Persona.saludar;

public class EjemploHogar {

    public static void main(String[] args) {

        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

    }

}