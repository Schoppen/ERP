package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Licores;


@Repository
public interface LicoresRepository extends CrudRepository<Licores, Long> {

	
	public Set<Licores> findAll();
	
}
