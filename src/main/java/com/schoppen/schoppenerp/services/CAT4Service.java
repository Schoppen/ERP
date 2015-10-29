package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.CATEG4;

public interface CAT4Service {
	
	public Set<CATEG4> getAll();
	
	public CATEG4 getOne(int id_cat4);
	
	public CATEG4 create(String cat4);
	
	public CATEG4 delete(int id_cat4);
	
	public CATEG4 modify(int id_cat4, String cat4);
	
}
