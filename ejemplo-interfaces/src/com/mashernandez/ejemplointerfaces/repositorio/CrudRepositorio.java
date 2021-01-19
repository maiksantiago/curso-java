package com.mashernandez.ejemplointerfaces.repositorio;

import com.mashernandez.ejemplointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente> listar();

    Cliente porId(Integer id);

    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(Integer id);

}