package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Familias;

public interface FamiliasServices {
	
	public Set<Familias> getAll();
	
	public Familias getOne(int id_fam);
	
	public Familias create(String fam);
	
	public Familias delete(int id_fam);
	
	public Familias modify(int id_fam, String fam);
	
}
