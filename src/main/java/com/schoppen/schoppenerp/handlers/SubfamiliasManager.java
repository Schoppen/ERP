package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.SubfamiliasRepository;
import com.schoppen.schoppenerp.model.Subfamilias;
import com.schoppen.schoppenerp.services.SubfamiliasService;

public class SubfamiliasManager implements SubfamiliasService {

	@Autowired
	private SubfamiliasRepository subRepo;
	
	@Override
	public Set<Subfamilias> getAll() {
		return subRepo.findAll();
	}

	@Override
	public Subfamilias getOne(int id_subfam) {
		Long id = new Long(id_subfam);
		return subRepo.findOne(id);
	}

	@Override
	public Subfamilias create(String subfam) {
		Subfamilias subfamilia = new Subfamilias();
		subfamilia.setSubfamilia(subfam);
		return subRepo.save(subfamilia);
	}

	@Override
	public Subfamilias delete(int id_subfam) {
		Long id = new Long(id_subfam);
		Subfamilias subfamilia = subRepo.findOne(id);
		subRepo.delete(subfamilia);
		return subfamilia;
	}

	@Override
	public Subfamilias modify(int id_subfam, String subfam) {
		Long id = new Long(id_subfam);
		Subfamilias subfamilia = subRepo.findOne(id);
		subfamilia.setSubfamilia(subfam);
		return subRepo.save(subfamilia);
	}

}
