package com.msproveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproveedor.entity.Proveedores;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer>{

	//JAVA PERSETEN QUERY LENGUAJE
	@Query("SELECT p FROM Proveedores p WHERE p.nombre =:name ")
	Proveedores findbyname(@Param("name")String name);
}
