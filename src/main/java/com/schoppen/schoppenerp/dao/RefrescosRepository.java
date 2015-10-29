package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Refrescos;


@Repository
public interface RefrescosRepository extends CrudRepository<Refrescos, Long> {

	
	public Set<Refrescos> findAll();
	
}
