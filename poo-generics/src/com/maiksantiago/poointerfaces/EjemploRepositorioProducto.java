package com.maiksantiago.poointerfaces;

import com.maiksantiago.poointerfaces.modelo.Producto;
import com.maiksantiago.poointerfaces.repositorio.*;
import com.maiksantiago.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {

    public static void main(String[] args) {

        System.out.println("----- Crear -----");
        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 50.52));
        repo.crear(new Producto("Silla", 18.0));
        repo.crear(new Producto("Lampara", 15.5));
        repo.crear(new Producto("Notebook", 400.89));

        System.out.println("\n----- Listar -----");
        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println("\n----- Paginar -----");
        List<Producto> paginar = ((PaginableRepositorio) repo).listar(1, 4);
        paginar.forEach(System.out::println);

        System.out.println("\n----- Ordenar ASC por descripción -----");
        List<Producto> productosOrdenAsc = ((OrdenableRepositorio) repo).listar("descripcion", Direccion.ASC);
        for (Producto p : productosOrdenAsc) {
            System.out.println(p);
        }

        System.out.println("\n----- Ordenar DESC por descripción -----");
        List<Producto> productosOrdenDesc = ((OrdenableRepositorio) repo).listar("descripcion", Direccion.DESC);
        for (Producto p : productosOrdenDesc) {
            System.out.println(p);
        }

        System.out.println("\n----- Editar -----");
        Producto lamparaActualizar = new Producto("Lampara de escritorio", 23.0);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);

        System.out.println("\n----- Listar -----");
        repo.listar().forEach(c -> System.out.println(c));

        System.out.println("\n----- Por Id -----");
        Producto lamparaEscritorio = repo.porId(3);
        System.out.println(lamparaEscritorio);

        System.out.println("\n----- Eliminar -----");
        repo.eliminar(3);

        System.out.println("\n----- Listar -----");
        repo.listar().forEach(System.out::println);

        System.out.println("\n----- Total -----");
        System.out.println("Registros totales: " + repo.total());

    }

}