package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.FamiliasRepository;
import com.schoppen.schoppenerp.model.Familias;
import com.schoppen.schoppenerp.services.FamiliasServices;

public class FamilasManager implements FamiliasServices {
	
	@Autowired
	private FamiliasRepository famRepo;
	
	@Override
	public Set<Familias> getAll() {
		return famRepo.findAll();
	}

	@Override
	public Familias getOne(int id_fam) {
		Long id = new Long(id_fam);
		return famRepo.findOne(id);
	}

	@Override
	public Familias create(String fam) {
		Familias familia = new Familias();
		familia.setFamilia(fam);
		return famRepo.save(familia);
	}

	@Override
	public Familias delete(int id_fam) {
		Long id = new Long(id_fam);
		Familias familia = famRepo.findOne(id);
		famRepo.delete(familia);
		return familia;
	}

	@Override
	public Familias modify(int id_fam, String fam) {
		Long id = new Long(id_fam);
		Familias familia = famRepo.findOne(id);
		familia.setFamilia(fam);
		return famRepo.save(familia);
	}

}
