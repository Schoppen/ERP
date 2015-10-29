package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Productos;

@Repository
public interface ProductosRepository extends CrudRepository<Productos, Long> {

	public Set<Productos> findAll();
	
}
