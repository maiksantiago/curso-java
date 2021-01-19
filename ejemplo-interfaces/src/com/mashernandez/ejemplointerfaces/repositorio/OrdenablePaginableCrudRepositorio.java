package com.mashernandez.ejemplointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
        PaginableRepositorio, CrudRepositorio, ContableRepositorio {
}