package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Cervezas;


@Repository
public interface CervezasRepository extends CrudRepository<Cervezas, Long> {

	
	public Set<Cervezas> findAll();
	
}
