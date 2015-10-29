package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Alimentos;

@Repository
public interface AlimentosRepository extends CrudRepository<Alimentos, Long> {

	public Set<Alimentos> findAll();
}
