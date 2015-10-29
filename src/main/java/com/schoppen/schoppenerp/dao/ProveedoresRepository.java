package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Proveedores;


@Repository
public interface ProveedoresRepository extends CrudRepository<Proveedores, Long> {

	public Set<Proveedores> findAll();
	
}
