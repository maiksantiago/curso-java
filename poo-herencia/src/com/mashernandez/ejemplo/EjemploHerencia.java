package com.mashernandez.ejemplo;

import com.mashernandez.pooherencia.Alumno;
import com.mashernandez.pooherencia.AlumnoInternacional;
import com.mashernandez.pooherencia.Profesor;

public class EjemploHerencia {

    public static void main(String[] args) {

        System.out.println("----- Creando la instancia de la clase Alumno -----");
        Alumno alumno = new Alumno();
        alumno.setNombre("Miguel");
        alumno.setApellido("Santiago");
        alumno.setEdad(25);
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(8.5);
        alumno.setNotaHistoria(8.2);
        alumno.setNotaMatematicas(9.4);

        System.out.println("----- Creando la instancia de la clase AlumnoInternacional -----");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(20);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(8.8);
        alumnoInt.setNotaCastellano(8.2);
        alumnoInt.setNotaHistoria(8.8);
        alumnoInt.setNotaMatematicas(9.5);

        System.out.println("----- Creando la instancia de la clase de Profesor -----");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println("----- Alumno -----");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + ": " + alumno.getInstitucion());
        System.out.println("----- AlumnoInternacional -----");
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + ": " + alumnoInt.getInstitucion() + ", " + alumnoInt.getPais());
        System.out.println("----- Profesor -----");
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }

}