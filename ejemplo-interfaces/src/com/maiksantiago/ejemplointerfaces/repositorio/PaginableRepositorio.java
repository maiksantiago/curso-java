package com.maiksantiago.ejemplointerfaces.repositorio;

import com.maiksantiago.ejemplointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);

}