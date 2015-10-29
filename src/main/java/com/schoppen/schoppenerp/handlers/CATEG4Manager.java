package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.CATEG4Repository;
import com.schoppen.schoppenerp.model.CATEG4;
import com.schoppen.schoppenerp.services.CAT4Service;

public class CATEG4Manager implements CAT4Service {

	@Autowired
	private CATEG4Repository cat4Repo;
	
	@Override
	public Set<CATEG4> getAll() {
		return cat4Repo.findAll();
	}

	@Override
	public CATEG4 getOne(int id_cat4) {
		Long id = new Long(id_cat4);
		return cat4Repo.findOne(id);
	}

	@Override
	public CATEG4 create(String cat4) {
		CATEG4 categ4 = new CATEG4();
		categ4.setNombre(cat4);
		return cat4Repo.save(categ4);
	}

	@Override
	public CATEG4 delete(int id_cat4) {
		Long id = new Long(id_cat4);
		CATEG4 categ4 = cat4Repo.findOne(id);
		cat4Repo.delete(categ4);
		return categ4;
	}

	@Override
	public CATEG4 modify(int id_cat4, String cat4) {
		Long id = new Long(id_cat4);
		CATEG4 categ4 = cat4Repo.findOne(id);
		categ4.setNombre(cat4);
		return cat4Repo.save(categ4);
	}

}
