package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Pedidos;


@Repository
public interface PedidosRepository extends CrudRepository<Pedidos, Long> {

	
	public Set<Pedidos> findAll();
	
}
