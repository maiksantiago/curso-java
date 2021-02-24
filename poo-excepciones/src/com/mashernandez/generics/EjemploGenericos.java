package com.mashernandez.generics;

import com.mashernandez.poointerfaces.modelo.Cliente;
import com.mashernandez.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Miguel", "Santiago"));

        Cliente miguel = clientes.iterator().next();
        System.out.println("miguel = " + miguel);
        System.out.println("-----");

        Cliente[] clientesArreglo = {
                new Cliente("Luci", "Martínez"),
                new Cliente("Miguel", "Santiago")
        };

        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);
        System.out.println("-----");

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe", "Luci", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);
        System.out.println("-----");

        List<ClientePremium> clientesPremiumList = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Paco", "Fernández")
        });

        imprimirClientes(clientes);
        System.out.println("-----");
        imprimirClientes(clientesLista);
        System.out.println("-----");
        imprimirClientes(clientesPremiumList);
        System.out.println("-----");

        System.out.println("El máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("El máximo de 3.9, 11.6, 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("El máximo de zanahoria, arándano y manzana es: " +
                maximo("zanahoria", "arándano", "manzana"));

    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}