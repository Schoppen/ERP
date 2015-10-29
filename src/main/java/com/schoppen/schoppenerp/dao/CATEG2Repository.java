package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.CATEG2;


@Repository
public interface CATEG2Repository extends CrudRepository<CATEG2, Long> {

	public Set<CATEG2> findAll();
	
}
