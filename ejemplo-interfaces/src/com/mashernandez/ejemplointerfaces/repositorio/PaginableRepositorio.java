package com.mashernandez.ejemplointerfaces.repositorio;

import com.mashernandez.ejemplointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);

}