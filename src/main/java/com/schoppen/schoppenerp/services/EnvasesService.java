package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Envases;

public interface EnvasesService {
	
	public Set<Envases> getAll();
	
	public Envases getOne(int id_env);
	
	public Envases create(String envase);
	
	public Envases delete(int id_env);
	
	public Envases modify(int id_env, String envase);
	
}
