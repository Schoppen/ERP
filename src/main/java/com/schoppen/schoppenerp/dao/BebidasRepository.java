package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Bebidas;


@Repository
public interface BebidasRepository extends CrudRepository<Bebidas, Long> {

	public Set<Bebidas> findAll();
	
}
