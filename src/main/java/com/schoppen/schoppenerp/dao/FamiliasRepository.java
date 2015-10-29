package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Familias;


@Repository
public interface FamiliasRepository extends CrudRepository<Familias, Long> {

	public Set<Familias> findAll();
	
}
