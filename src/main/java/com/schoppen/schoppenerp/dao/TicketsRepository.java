package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Tickets;


@Repository
public interface TicketsRepository extends CrudRepository<Tickets, Long> {

	public Set<Tickets> findAll();
	
}
