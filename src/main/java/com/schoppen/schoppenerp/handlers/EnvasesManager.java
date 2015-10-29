package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.EnvasesRepository;
import com.schoppen.schoppenerp.model.Envases;
import com.schoppen.schoppenerp.services.EnvasesService;

public class EnvasesManager implements EnvasesService{

	@Autowired
	private EnvasesRepository envRepo;
	
	@Override
	public Set<Envases> getAll() {
		return envRepo.findAll();
	}

	@Override
	public Envases getOne(int id_env) {
		Long id = new Long(id_env);
		return envRepo.findOne(id);
	}

	@Override
	public Envases create(String envase) {
		Envases env = new Envases();
		env.setEnvase(envase);
		return envRepo.save(env);
	}

	@Override
	public Envases delete(int id_env) {
		Long id = new Long(id_env);
		Envases env = envRepo.findOne(id);
		envRepo.delete(env);
		return env;
	}

	@Override
	public Envases modify(int id_env, String envase) {
		Long id = new Long(id_env);
		Envases env = envRepo.findOne(id);
		env.setEnvase(envase);
		return envRepo.save(env);
	}

}
