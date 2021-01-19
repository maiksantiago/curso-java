package com.mashernandez.ejemplointerfaces.repositorio;

import com.mashernandez.ejemplointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}