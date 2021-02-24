package com.maiksantiago.poointerfaces;

import com.maiksantiago.poointerfaces.modelo.Cliente;
import com.maiksantiago.poointerfaces.repositorio.Direccion;
import com.maiksantiago.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import com.maiksantiago.poointerfaces.repositorio.OrdenableRepositorio;
import com.maiksantiago.poointerfaces.repositorio.PaginableRepositorio;
import com.maiksantiago.poointerfaces.repositorio.excepciones.AccesoDatoException;
import com.maiksantiago.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import com.maiksantiago.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import com.maiksantiago.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import com.maiksantiago.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {

        try {
            System.out.println("----- Crear -----");
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Miguel", "Santiago"));
            repo.crear(new Cliente("Bea", "González"));
            repo.crear(new Cliente("Luci", "Martínez"));
            repo.crear(new Cliente("Andrés", "Guzmán"));

            /* Nulo
            repo.crear(null); */

            /* Duplicado
            Cliente miguel = new Cliente("Miguel", "Santiago");
            repo.crear(miguel);
            repo.crear(miguel); */

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
            /* Lectura
            Cliente bea = repo.porId(0); */
            Cliente bea = repo.porId(2);
            System.out.println(bea);

            System.out.println("\n----- Eliminar -----");
            repo.eliminar(2);

            System.out.println("\n----- Listar -----");
            repo.listar().forEach(System.out::println);

            System.out.println("\n----- Total -----");
            System.out.println("Registros totales: " + repo.total());
        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro Duplicado: " + e.getMessage());
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura: " + e.getMessage());
        } catch (AccesoDatoException e) {
            System.out.println("Genérica: " + e.getMessage());
            e.printStackTrace();
        }

    }

}