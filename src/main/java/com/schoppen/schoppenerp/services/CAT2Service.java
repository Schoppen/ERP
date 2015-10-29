package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.CATEG2;

public interface CAT2Service {
	
	public Set<CATEG2> getAll();
	
	public CATEG2 getOne(int id_cat2);
	
	public CATEG2 create(String cat2);
	
	public CATEG2 delete(int id_cat2);
	
	public CATEG2 modify(int id_cat2, String cat2);
	
}
