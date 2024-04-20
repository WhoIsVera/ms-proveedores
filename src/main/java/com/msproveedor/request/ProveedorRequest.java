package com.msproveedor.request;

public class ProveedorRequest {
 int proveedorid;
 String nombre;
 String telefono;
 String correo;
public ProveedorRequest(int proveedorid, String nombre, String telefono, String correo) {
	super();
	this.proveedorid = proveedorid;
	this.nombre = nombre;
	this.telefono = telefono;
	this.correo = correo;
}
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
@Override
public String toString() {
	return "ProveedorRequest [proveedorid=" + proveedorid + ", nombre=" + nombre + ", telefono=" + telefono
			+ ", correo=" + correo + "]";
}
 	
 
 
}
