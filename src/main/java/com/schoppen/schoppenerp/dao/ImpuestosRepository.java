package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Impuestos;

@Repository
public interface ImpuestosRepository extends CrudRepository<Impuestos, Long> {

	public Set<Impuestos> findAll();
	
}
