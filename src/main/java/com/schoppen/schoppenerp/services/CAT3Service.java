package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.CATEG3;

public interface CAT3Service {
	
	public Set<CATEG3> getAll();
	
	public CATEG3 getOne(int id_cat3);
	
	public CATEG3 create(String cat3);
	
	public CATEG3 delete(int id_cat3);
	
	public CATEG3 modify(int id_cat3, String cat3);
	
}
