package com.msproveedor.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PROVEEDOR")

public class Proveedores implements Serializable{
	
	private static final long serialVersion = 1L;
	
	@Id
	@Column(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int proveedorid;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2")
	String nombre;
	
	@Column(name="TELEFONO", columnDefinition="NVARCHAR2")
	String telefono;
	
	@Column(name="CORREO", columnDefinition="NVARCHAR2")
	String correo;

	public int getProveedorid() {
		return proveedorid;
	}

	public void setProveedorid(int proveedorid) {
		this.proveedorid = proveedorid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public static long getSerialversion() {
		return serialVersion;
	}

	
	
	

}
