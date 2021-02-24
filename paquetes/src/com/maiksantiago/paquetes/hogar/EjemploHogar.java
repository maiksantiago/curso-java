package com.maiksantiago.paquetes.hogar;

import com.maiksantiago.paquetes.jardin.Perro;

import static com.maiksantiago.paquetes.hogar.Persona.saludar;

public class EjemploHogar {

    public static void main(String[] args) {

        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

    }

}