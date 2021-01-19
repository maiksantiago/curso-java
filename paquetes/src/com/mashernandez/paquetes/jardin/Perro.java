package com.mashernandez.paquetes.jardin;

import com.mashernandez.paquetes.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }

}