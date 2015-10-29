package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Mesas;


public interface MesasService {
	
	public Set<Mesas> getAll();
	
	public Mesas getOne(int id_mesa);
	
	public Mesas create(int id_mesa);
	
	public Mesas delete(int id_mesa);
	
	public Mesas setOpen(int id_mesa);
	
	public Mesas setClose(int id_mesa);
	
	public Mesas setPay(int id_mesa);
	
	public Mesas modifyPeople(int id_mesa, int num_comen);
	
	public Mesas modifyStatus(int id_mesa, String status);

}
