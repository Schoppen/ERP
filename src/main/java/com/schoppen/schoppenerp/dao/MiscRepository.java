package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Misc;

@Repository
public interface MiscRepository extends CrudRepository<Misc, Long> {

	public Set<Misc> findAll();
	
}
