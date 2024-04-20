package com.msproveedor.service;

import java.util.List;

import com.msproveedor.entity.Proveedores;
import com.msproveedor.request.ProveedorRequest;

public interface ProveedoresService {
	Proveedores guardar(ProveedorRequest request);
	Proveedores actualizar(ProveedorRequest request);
	Proveedores buscar(int id);
	
	String eliminar(int id);
	List mostrar();
}
