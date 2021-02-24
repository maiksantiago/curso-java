package com.maiksantiago.pooexcepciones.ejemplo;

import java.util.Scanner;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa un entero numerador:");
        String numerador = s.nextLine();
        System.out.println("Ingresa un entero divisor:");
        String divisor = s.nextLine();

        try {
            double division = cal.dividir(numerador, divisor);
            System.out.println("division = " + division);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detectó una excepción: ingresa un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
        } catch (DivisionPorZeroException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción!");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!");

    }

}