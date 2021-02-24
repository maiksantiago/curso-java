package com.maiksantiago.poointerfaces.imprenta;

import com.maiksantiago.poointerfaces.imprenta.modelo.*;

import static com.maiksantiago.poointerfaces.imprenta.modelo.Imprimible.*;
import static com.maiksantiago.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Resumen laboral...",
                new Persona("John", "Doe"), "Ingeniero de sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador Fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño", PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Estudio sobre micro servicios", new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        Imprimible.imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });

        System.out.println(TEXTO_DEFECTO);

    }

}