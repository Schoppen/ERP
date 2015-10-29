package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Status;

public interface StatusService {

	public Set<Status> getAll();
	
	public Status getOne(int id_stat);
	
	public Status create(String stat);
	
	public Status delete(int id_stat);
	
	public Status modify(int id_stat, String stat);
}