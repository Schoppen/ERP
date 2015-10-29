package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.StatusRepository;
import com.schoppen.schoppenerp.model.Status;
import com.schoppen.schoppenerp.services.StatusService;

public class StatusManager implements StatusService {

	@Autowired
	private StatusRepository statRepo;
	
	@Override
	public Set<Status> getAll() {
		return statRepo.findAll();
	}

	@Override
	public Status getOne(int id_stat) {
		Long id = new Long(id_stat);
		return statRepo.findOne(id);
	}

	@Override
	public Status create(String stat) {
		Status status = new Status();
		status.setEstado(stat);
		return statRepo.save(status);
	}

	@Override
	public Status delete(int id_stat) {
		Long id = new Long(id_stat);
		Status stat = statRepo.findOne(id);
		statRepo.delete(stat);
		return stat;
	}

	@Override
	public Status modify(int id_stat, String stat) {
		Long id = new Long(id_stat);
		Status status = statRepo.findOne(id);
		status.setEstado(stat);
		return statRepo.save(status);
	}

}
