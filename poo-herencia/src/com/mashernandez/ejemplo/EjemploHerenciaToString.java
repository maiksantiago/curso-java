package com.mashernandez.ejemplo;

import com.mashernandez.pooherencia.Alumno;
import com.mashernandez.pooherencia.AlumnoInternacional;
import com.mashernandez.pooherencia.Persona;
import com.mashernandez.pooherencia.Profesor;

public class EjemploHerenciaToString {

    public static void main(String[] args) {

        System.out.println("----- Creando la instancia de la clase Alumno -----");
        Alumno alumno = new Alumno("Miguel", "Santiago", 25, "Instituto Nacional");
        alumno.setNotaCastellano(8.5);
        alumno.setNotaHistoria(8.2);
        alumno.setNotaMatematicas(9.4);
        alumno.setEmail("miguel@mail.com");

        System.out.println("----- Creando la instancia de la clase AlumnoInternacional -----");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(20);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(8.8);
        alumnoInt.setNotaCastellano(8.2);
        alumnoInt.setNotaHistoria(8.8);
        alumnoInt.setNotaMatematicas(9.5);
        alumnoInt.setEmail("peter@mail.com");

        System.out.println("----- Creando la instancia de la clase de Profesor -----");
        Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
        profesor.setEdad(45);
        profesor.setEmail("luci@mail.com");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {

        System.out.println("----------------------------------------");
        System.out.println(persona);

    }

}