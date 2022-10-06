package com.mx.ClientesBancoAzteca.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ClientesBancoAzteca.Dao.ClientesDao;
import com.mx.ClientesBancoAzteca.Dominio.Clientes;

@Service
public class ClientesSerImp implements MetodosCliente{

	@Autowired
	ClientesDao clientesDao;

	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub
		clientesDao.save(cliente);
	}

	@Override
	public void editar(Clientes cliente) {
		// TODO Auto-generated method stub
		clientesDao.save(cliente);
	}

	@Override
	public void eliminar(Clientes cliente) {
		// TODO Auto-generated method stub
		clientesDao.delete(cliente);
	}

	@Override
	public Clientes buscar(Clientes cliente) {
		// TODO Auto-generated method stub
		return clientesDao.findById(cliente.getId()).orElse(null);
	}

	@Override
	public List<Clientes> listar() {
		// TODO Auto-generated method stub
		return (List<Clientes>) clientesDao.findAll();
	}
	
}
