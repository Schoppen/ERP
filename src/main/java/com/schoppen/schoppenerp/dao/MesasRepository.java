package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Mesas;


@Repository
public interface MesasRepository extends CrudRepository<Mesas, Long> {

	public Set<Mesas> findAll();	
	
}
