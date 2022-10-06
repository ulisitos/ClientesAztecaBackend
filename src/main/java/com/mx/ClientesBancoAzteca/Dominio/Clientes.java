package com.mx.ClientesBancoAzteca.Dominio;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {

	/*ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
FECHA_NACIMIENTO DATE,
CELULAR NUMBER,
CORREO_ELECTRONICO NVARCHAR2(100)*/
	@Id
	@Column(name="ID", columnDefinition = "NUMBER")
	int id;
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(100)")
	String nombre;
	@Column(name="FECHANACIMIENTO", columnDefinition = "DATE")
	Date fechaNacimiento;
	@Column(name="CELULAR", columnDefinition = "NUMBER")
	long celular;
	@Column(name="CORREO", columnDefinition = "NVARCHAR2(100)")
	String correo;
	
	public Clientes() {
		
	}

	public Clientes(int id) {
		
		this.id = id;
	}

	public Clientes(int id, String nombre, Date fechaNacimiento, long celular, String correo) {
		
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.celular = celular;
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
}
