package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Subfamilias;


@Repository
public interface SubfamiliasRepository extends CrudRepository<Subfamilias, Long> {

	public Set<Subfamilias> findAll();
	
}
