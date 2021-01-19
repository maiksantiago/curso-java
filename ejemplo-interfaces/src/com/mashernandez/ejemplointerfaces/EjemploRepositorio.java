package com.mashernandez.ejemplointerfaces;

import com.mashernandez.ejemplointerfaces.modelo.Cliente;
import com.mashernandez.ejemplointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {

        System.out.println("----- Crear -----");
        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Miguel", "Santiago"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés", "Guzmán"));

        System.out.println("\n----- Listar -----");
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("\n----- Paginar -----");
        List<Cliente> paginar = ((PaginableRepositorio) repo).listar(1, 4);
        paginar.forEach(System.out::println);

        System.out.println("\n----- Ordenar ASC por apellido -----");
        List<Cliente> clientesOrdenApellidoAsc = ((OrdenableRepositorio) repo).listar("apellido", Direccion.ASC);
        for (Cliente c : clientesOrdenApellidoAsc) {
            System.out.println(c);
        }

        System.out.println("\n----- Ordenar DESC por apellido -----");
        List<Cliente> clientesOrdenApellidoDesc = ((OrdenableRepositorio) repo).listar("apellido", Direccion.DESC);
        for (Cliente c : clientesOrdenApellidoDesc) {
            System.out.println(c);
        }

        System.out.println("\n----- Ordenar ASC por nombre -----");
        List<Cliente> clientesOrdenNombreAsc = ((OrdenableRepositorio) repo).listar("nombre", Direccion.ASC);
        for (Cliente c : clientesOrdenNombreAsc) {
            System.out.println(c);
        }

        System.out.println("\n----- Ordenar DESC por nombre -----");
        List<Cliente> clientesOrdenNombreDesc = ((OrdenableRepositorio) repo).listar("nombre", Direccion.DESC);
        for (Cliente c : clientesOrdenNombreDesc) {
            System.out.println(c);
        }

        System.out.println("\n----- Editar -----");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);

        System.out.println("\n----- Listar -----");
        repo.listar().forEach(c -> System.out.println(c));

        System.out.println("\n----- Por Id -----");
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println("\n----- Eliminar -----");
        repo.eliminar(2);

        System.out.println("\n----- Listar -----");
        repo.listar().forEach(System.out::println);

    }

}