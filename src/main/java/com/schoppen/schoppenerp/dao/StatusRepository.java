package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Status;


@Repository
public interface StatusRepository extends CrudRepository<Status, Long> {

	public Set<Status> findAll();
	
	public Status findByEstado(String status);
}
