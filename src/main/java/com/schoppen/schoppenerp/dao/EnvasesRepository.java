package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Envases;


@Repository
public interface EnvasesRepository extends CrudRepository<Envases, Long> {

	public Set<Envases> findAll();
	
}
