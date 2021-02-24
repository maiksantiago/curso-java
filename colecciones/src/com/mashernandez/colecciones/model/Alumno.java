package com.mashernandez.colecciones.model;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota;
    }

    @Override
    public int compareTo(Alumno o) {
        if (this.nombre == null) {
            return 0;
        }
        return this.nombre.compareTo(o.nombre);
        /* if (this.nota == o.nota) {
            return 0;
        }
        if (this.nota > o.nota) {
            return 1;
        } else {
            return -1;
        } */
        /* if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(o.nota); */
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

}