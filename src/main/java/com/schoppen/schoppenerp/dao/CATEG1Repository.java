package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.CATEG1;

@Repository
public interface CATEG1Repository extends CrudRepository<CATEG1, Long> {

	public Set<CATEG1> findAll();
	
}
