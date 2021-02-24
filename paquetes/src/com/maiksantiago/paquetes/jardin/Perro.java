package com.maiksantiago.paquetes.jardin;

import com.maiksantiago.paquetes.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }

}