package com.maiksantiago.ejemplointerfaces.repositorio;

import com.maiksantiago.ejemplointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}