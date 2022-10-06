package com.mx.ClientesBancoAzteca.Dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.ClientesBancoAzteca.Dominio.Clientes;

public interface ClientesDao extends CrudRepository<Clientes, Integer>{

}
