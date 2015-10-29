package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Tamanos;

public interface TamanosService {
	
	public Set<Tamanos> getAll();
	
	public Tamanos getOne(int id_tam);
	
	public Tamanos create(String tam);
	
	public Tamanos delete(int id_tam);
	
	public Tamanos modify(int id_tam, String tam);
	
}
