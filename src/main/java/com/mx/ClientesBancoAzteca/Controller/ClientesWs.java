package com.mx.ClientesBancoAzteca.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ClientesBancoAzteca.Dominio.Clientes;
import com.mx.ClientesBancoAzteca.Servicio.MetodosCliente;

@RestController
@RequestMapping("ClientesWs")
@CrossOrigin
public class ClientesWs {

	@Autowired
	MetodosCliente metodos;

	// http://localhost:9001/ClientesWs/listar
	@GetMapping("listar")
	public List<Clientes> listar() {
		List<Clientes> lista = metodos.listar();
		return lista;
	}

	// METODO QUE NOS PERMITE GUARDAR
	// http://localhost:9001/ClientesWs/guardarCliente
	@PostMapping("guardarCliente")
	public ResponseEntity<String> guardar(@RequestBody Clientes cliente) {
		metodos.guardar(cliente);
		return new ResponseEntity<String>("Guardado con exito", HttpStatus.OK);
	}

	// METODO PARA EDITAR
	// http://localhost:9001/ClientesWs/editarCliente
	@PutMapping("editarCliente")
	public ResponseEntity<String> editar(@RequestBody Clientes cliente) {
		metodos.editar(cliente);
		return new ResponseEntity<String>("Se editó con exito", HttpStatus.OK);
	}

	// METODO PARA ELIMINAR POR ID
	// http://localhost:9001/ClientesWs/eliminarCliente
	@DeleteMapping("eliminarCliente")
	public ResponseEntity<String> eliminar(@RequestBody Clientes cliente) {
		metodos.eliminar(cliente);
		return new ResponseEntity<String>("Se eliminó con exito", HttpStatus.OK);
	}

	// METODO PARA BUSCAR CLIENTES
	// http://localhost:9001/ClientesWs/buscarCliente
	@PostMapping("buscarCliente")
	public Clientes Buscar(@RequestBody Clientes cliente) {
		cliente = metodos.buscar(cliente);
		return cliente;
	}
}
