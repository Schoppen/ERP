package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Subfamilias;

public interface SubfamiliasService {
	
	public Set<Subfamilias> getAll();
	
	public Subfamilias getOne(int id_subfam);
	
	public Subfamilias create(String subfam);
	
	public Subfamilias delete(int id_subfam);
	
	public Subfamilias modify(int id_subfam, String subfam);
	
}
