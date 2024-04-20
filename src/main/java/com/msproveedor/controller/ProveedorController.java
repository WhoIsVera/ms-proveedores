package com.msproveedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproveedor.entity.Proveedores;
import com.msproveedor.logic.ProveedorLogic;
import com.msproveedor.request.ProveedorRequest;


@RestController
@RequestMapping("proveedores/")
public class ProveedorController {
	
	@Autowired
	ProveedorLogic service;
	
	@GetMapping
	public ResponseEntity<List<Proveedores>> mostrar(){
		List<Proveedores> proveedores = service.mostrar();
		return new ResponseEntity<List<Proveedores>>(proveedores,HttpStatus.OK);
	}
	
		@PostMapping
		public ResponseEntity<Proveedores> guardar(@RequestBody ProveedorRequest request){
			Proveedores pro = service.guardar(request);
			return new ResponseEntity<Proveedores>(pro,HttpStatus.OK);
		}
			@PutMapping
			public ResponseEntity<Proveedores> actualizar(@RequestBody ProveedorRequest request){
				Proveedores pro = service.actualizar(request);
				return new ResponseEntity<Proveedores>(pro,HttpStatus.OK);
			}
			
				@GetMapping("buscar/{id}")
				public ResponseEntity<Proveedores>buscar(@PathVariable int id){
					Proveedores pro =service.buscar(id);
					return new ResponseEntity<Proveedores>(pro, HttpStatus.OK);
				}
				
					
					@DeleteMapping("eliminar/{id}")
					public ResponseEntity<String> eliminar(@PathVariable int id){
						String mensaje = service.eliminar(id);
						return new ResponseEntity<String>(mensaje, HttpStatus.OK);
					}
					@GetMapping("buscar-Nombre/{name}")
					public ResponseEntity<Proveedores>buscarNombre(@PathVariable String name){
						Proveedores pro =service.buscarNombre(name);
						return new ResponseEntity<Proveedores>(pro, HttpStatus.OK);
					}
}
