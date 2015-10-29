package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.CATEG1Repository;
import com.schoppen.schoppenerp.model.CATEG1;
import com.schoppen.schoppenerp.services.CAT1Service;

public class CATEG1Manager implements CAT1Service {

	@Autowired
	private CATEG1Repository cat1Repo;
	
	@Override
	public Set<CATEG1> getAll() {
		return cat1Repo.findAll();
	}

	@Override
	public CATEG1 getOne(int id_cat1) {
		Long id = new Long(id_cat1);
		return cat1Repo.findOne(id);
	}

	@Override
	public CATEG1 create(String cat1) {
		CATEG1 categ1 = new CATEG1();
		categ1.setNombre(cat1);
		return cat1Repo.save(categ1);
	}

	@Override
	public CATEG1 delete(int id_cat1) {
		Long id = new Long(id_cat1);
		CATEG1 categ1 = cat1Repo.findOne(id);
		cat1Repo.delete(categ1);
		return categ1;
	}

	@Override
	public CATEG1 modify(int id_cat1, String cat1) {
		Long id = new Long(id_cat1);
		CATEG1 categ1 = cat1Repo.findOne(id);
		categ1.setNombre(cat1);
		return cat1Repo.save(categ1);
	}


}
