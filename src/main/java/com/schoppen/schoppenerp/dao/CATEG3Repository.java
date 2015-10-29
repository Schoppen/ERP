package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.CATEG3;


@Repository
public interface CATEG3Repository extends CrudRepository<CATEG3, Long> {

	public Set<CATEG3> findAll();
	
}
