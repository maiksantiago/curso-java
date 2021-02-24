package com.maiksantiago.ejemplointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
        PaginableRepositorio, CrudRepositorio, ContableRepositorio {
}