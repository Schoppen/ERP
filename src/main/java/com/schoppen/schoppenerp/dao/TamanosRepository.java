package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Tamanos;


@Repository
public interface TamanosRepository extends CrudRepository<Tamanos, Long> {

	public Set<Tamanos> findAll();
	
}
