package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Materiales;

@Repository
public interface MaterialesRepository extends CrudRepository<Materiales, Long> {

	public Set<Materiales> findAll();
	
}
