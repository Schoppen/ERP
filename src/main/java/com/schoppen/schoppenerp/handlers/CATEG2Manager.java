package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.CATEG2Repository;
import com.schoppen.schoppenerp.model.CATEG2;
import com.schoppen.schoppenerp.services.CAT2Service;

public class CATEG2Manager implements CAT2Service {

	@Autowired
	private CATEG2Repository cat2Repo;
	
	@Override
	public Set<CATEG2> getAll() {
		return cat2Repo.findAll();
	}

	@Override
	public CATEG2 getOne(int id_cat2) {
		Long id = new Long(id_cat2);
		return cat2Repo.findOne(id);
	}

	@Override
	public CATEG2 create(String cat2) {
		CATEG2 categ2 = new CATEG2();
		categ2.setNombre(cat2);
		return cat2Repo.save(categ2);
	}

	@Override
	public CATEG2 delete(int id_cat2) {
		Long id = new Long(id_cat2);
		CATEG2 categ2 = cat2Repo.findOne(id);
		cat2Repo.delete(categ2);
		return categ2;
	}

	@Override
	public CATEG2 modify(int id_cat2, String cat2) {
		Long id = new Long(id_cat2);
		CATEG2 categ2 = cat2Repo.findOne(id);
		categ2.setNombre(cat2);
		return cat2Repo.save(categ2);
	}

}
