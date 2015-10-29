package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.TamanosRepository;
import com.schoppen.schoppenerp.model.Tamanos;
import com.schoppen.schoppenerp.services.TamanosService;

public class TamanosManager implements TamanosService {

	@Autowired
	private TamanosRepository tamRepo;
	
	@Override
	public Set<Tamanos> getAll() {
		return tamRepo.findAll();
	}

	@Override
	public Tamanos getOne(int id_tam) {
		Long id = new Long(id_tam);
		return tamRepo.findOne(id);
	}

	@Override
	public Tamanos create(String tam) {
		Tamanos tamano = new Tamanos();
		tamano.setTamano(tam);
		return tamRepo.save(tamano);	
	}

	@Override
	public Tamanos delete(int id_tam) {
		Long id = new Long(id_tam);
		Tamanos tamano = tamRepo.findOne(id);
		tamRepo.delete(tamano);
		return tamano;
	}

	@Override
	public Tamanos modify(int id_tam, String tam) {
		Long id = new Long(id_tam);
		Tamanos tamano = tamRepo.findOne(id);
		tamano.setTamano(tam);
		return tamRepo.save(tamano);
	}

}
