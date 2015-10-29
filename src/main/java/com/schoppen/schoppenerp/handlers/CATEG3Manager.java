package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.CATEG3Repository;
import com.schoppen.schoppenerp.model.CATEG3;
import com.schoppen.schoppenerp.services.CAT3Service;

public class CATEG3Manager implements CAT3Service {

	@Autowired
	private CATEG3Repository cat3Repo;
	
	@Override
	public Set<CATEG3> getAll() {
		return cat3Repo.findAll();
	}

	@Override
	public CATEG3 getOne(int id_cat3) {
		Long id = new Long(id_cat3);
		return cat3Repo.findOne(id);
	}

	@Override
	public CATEG3 create(String cat3) {
		CATEG3 categ3 = new CATEG3();
		categ3.setNombre(cat3);
		return cat3Repo.save(categ3);
	}

	@Override
	public CATEG3 delete(int id_cat3) {
		Long id = new Long(id_cat3);
		CATEG3 categ3 = cat3Repo.findOne(id);
		cat3Repo.delete(categ3);
		return categ3;
	}

	@Override
	public CATEG3 modify(int id_cat3, String cat3) {
		Long id = new Long(id_cat3);
		CATEG3 categ3 = cat3Repo.findOne(id);
		categ3.setNombre(cat3);
		return cat3Repo.save(categ3);
	}
}
