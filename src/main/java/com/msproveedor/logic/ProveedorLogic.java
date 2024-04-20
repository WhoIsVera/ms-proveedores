package com.msproveedor.logic;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.msproveedor.entity.Proveedores;
import com.msproveedor.repository.ProveedoresRepository;
import com.msproveedor.request.ProveedorRequest;
import com.msproveedor.service.ProveedoresService;

@Service
public class ProveedorLogic implements ProveedoresService{
	@Autowired
	ProveedoresRepository repo;
	@Override
	public Proveedores guardar(ProveedorRequest request) {
		// TODO Auto-generated method stub
		Proveedores pro = new Proveedores();
		pro.setProveedorid(request.getProveedorid());
		pro.setNombre(request.getNombre());
		pro.setTelefono(request.getTelefono());
		pro.setCorreo(request.getCorreo());
		
		repo.save(pro);
		return pro;
	}

	@Override
	public Proveedores actualizar(ProveedorRequest request) {
		// TODO Auto-generated method stub
		Proveedores pro = repo.findById(request.getProveedorid()).get();
		pro.setProveedorid(request.getProveedorid());
		pro.setNombre(request.getNombre());
		pro.setTelefono(request.getTelefono());
		pro.setCorreo(request.getCorreo());
		
		repo.save(pro);
		return pro;
	}

	@Override
	public Proveedores buscar(int id) {
		// TODO Auto-generated method stub
		
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}
	
	public Proveedores buscarNombre(String name) {
		return repo.findbyname(name);
	}

}
