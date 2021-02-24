package com.maiksantiago.ejemplo;

import com.maiksantiago.pooherencia.Alumno;
import com.maiksantiago.pooherencia.AlumnoInternacional;
import com.maiksantiago.pooherencia.Persona;
import com.maiksantiago.pooherencia.Profesor;

public class EjemploHerenciaConstructores {

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

        System.out.println("----- Imprimir -----");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {

        System.out.println("- Imprimiendo datos en común del tipo Persona -");
        System.out.println("nombre: " + persona.getNombre() + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad() + ", email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("- Imprimiendo los datos del tipo Alumno -");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota de Matemáticas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota de Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota de Castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("- Imprimiendo los datos del tipo AlumnoInternacional -");
                System.out.println("Nota de Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println("***** Sobre escritura promedio *****");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("***** Sobre escritura promedio *****");
        }

        if (persona instanceof Profesor) {
            System.out.println("- Imprimiendo los datos del tipo Profesor -");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("***** Sobre escritura saludar *****");
        System.out.println(persona.saludar());
        System.out.println("***** Sobre escritura saludar *****");

    }

}