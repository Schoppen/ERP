package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Items;

@Repository
public interface ItemsRepository extends CrudRepository<Items, Long>{

	public Set<Items> findAll();
	
}
