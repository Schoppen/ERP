package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Impuestos;

public interface ImpuestosService {
	
	public Set<Impuestos> getAll();
	
	public Impuestos getOne(int id_imp);
	
	public Impuestos create(String nombre, float valor);
	
	public Impuestos delete(int id_imp);
	
	public Impuestos modifyName(int id_imp, String name);
	
	public Impuestos modifyValue(int id_imp, float value);

}
