package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.CATEG4;


@Repository
public interface CATEG4Repository extends CrudRepository<CATEG4, Long> {

	public Set<CATEG4> findAll();
	
}
