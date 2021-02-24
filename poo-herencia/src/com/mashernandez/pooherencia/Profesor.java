package com.mashernandez.pooherencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor() {
        System.out.println("Inicializando constructor de Profesor");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos días, soy el profesor de " + getAsignatura() + ". Mi nombre es " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura=" + asignatura;
    }

}