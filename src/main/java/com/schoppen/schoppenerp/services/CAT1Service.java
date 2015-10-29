package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.CATEG1;

public interface CAT1Service {
	
	public Set<CATEG1> getAll();
	
	public CATEG1 getOne(int id_cat1);
	
	public CATEG1 create(String cat1);
	
	public CATEG1 delete(int id_cat1);
	
	public CATEG1 modify(int id_cat1, String cat1);
	
}
