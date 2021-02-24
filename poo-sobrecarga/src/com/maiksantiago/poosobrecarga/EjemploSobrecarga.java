package com.maiksantiago.poosobrecarga;

import static com.maiksantiago.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        System.out.println("sumar int-int: " + sumar(10, 5));
        System.out.println("sumar float-float: " + sumar(10.0F, 5F));
        System.out.println("sumar float-int: " + sumar(10F, 5));
        System.out.println("sumar int-float: " + sumar(10, 5.0F));
        System.out.println("sumar double-double: " + sumar(10.0, 5.0));
        System.out.println("sumar String-String: " + sumar("10", "5"));

        System.out.println("sumar varargs: " + sumar(10, 5, 3));
        System.out.println("sumar varargs: " + sumar(10, 5, 3, 4));
        System.out.println("sumar varargs: " + sumar(10, 5, 3, 4, 6, 7));
        System.out.println("sumar varargs: " + sumar(10, 5F, 5, 9, 15));
        System.out.println("sumar varargs: " + sumar(10.0, 5.0, 3.5, 4.5));

        System.out.println("sumar float-float: " + sumar(10L, 5L)); // No existe un método que reciba dos parámetros o argumentos long. Utiliza el método que recibe dos parámetros float, float es el tipo más cercano de alojar tipos long, ya que un long cabe perfectamente en un float.
        System.out.println("sumar int-int: " + sumar(10, '@')); // Cada carácter en la tabla unicode representa un decimal. El carácter @ representa el número 64. Utiliza el método que recibe dos parámetros int.
        System.out.println("sumar float-int: " + sumar(10F, '@'));

    }

}