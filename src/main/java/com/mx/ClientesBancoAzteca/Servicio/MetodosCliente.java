package com.mx.ClientesBancoAzteca.Servicio;

import java.util.List;

import com.mx.ClientesBancoAzteca.Dominio.Clientes;

public interface MetodosCliente {

	public void guardar(Clientes cliente);

	public void editar(Clientes cliente);

	public void eliminar(Clientes cliente);

	public Clientes buscar(Clientes cliente);

	public List<Clientes> listar();
}
