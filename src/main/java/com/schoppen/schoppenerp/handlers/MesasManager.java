package com.schoppen.schoppenerp.handlers;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.MesasRepository;
import com.schoppen.schoppenerp.dao.StatusRepository;
import com.schoppen.schoppenerp.model.Mesas;
import com.schoppen.schoppenerp.model.Status;
import com.schoppen.schoppenerp.services.MesasService;

public class MesasManager implements MesasService{

	@Autowired
	private MesasRepository mesaRepo;
	
	@Autowired
	private StatusRepository statRepo;
	
	@Override
	public Set<Mesas> getAll() {
		return mesaRepo.findAll(); 
	}

	@Override
	public Mesas getOne(int id_mesa) {
		Long id = new Long(id_mesa);
		return mesaRepo.findOne(id);
	}

	@Override
	public Mesas create(int id_mesa) {
		Long id = new Long(id_mesa);
		Status stat = statRepo.findOne((long)0);
		Mesas mesa = new Mesas();
		mesa.setNum_mesa(id);
		mesa.setEstado(stat);
		return mesaRepo.save(mesa);
	}

	@Override
	public Mesas delete(int id_mesa) {
		Long id = new Long(id_mesa);
		Mesas mesa = mesaRepo.findOne(id);
		mesaRepo.delete(mesa);
		return mesa;
	}
	
	@Override
	public Mesas setOpen(int id_mesa) {
		Long id = new Long(id_mesa);
		Mesas mesa = mesaRepo.findOne(id);
		Date dt = new Date();
		Status ocupado = statRepo.findOne((long)1);
		mesa.setEstado(ocupado);
		mesa.setFecha_llegada_cliente(dt);
		return mesaRepo.save(mesa);
	}
	
	@Override
	public Mesas setPay(int id_mesa) {
		Long id = new Long(id_mesa);
		Mesas mesa = mesaRepo.findOne(id);
		Date dt = new Date();
		Status pagado = statRepo.findOne((long)2);
		mesa.setEstado(pagado);
		mesa.setFecha_cierre_ticket(dt);
		return mesaRepo.save(mesa);
	}
	
	@Override
	public Mesas setClose(int id_mesa) {
		Long id = new Long(id_mesa);
		Mesas mesa = mesaRepo.findOne(id);
		Status disponible = statRepo.findOne((long)0);
		Date dt = new Date();
		mesa.setFecha_salida_cliente(dt);
		mesa.setComensales(0);
		mesa.setEstado(disponible);
		return mesaRepo.save(mesa);
	}

	@Override
	public Mesas modifyPeople(int id_mesa, int num_comen) {
		Long id = new Long(id_mesa);
		Mesas mesa = mesaRepo.findOne(id);
		mesa.setComensales(num_comen);
		return mesaRepo.save(mesa);
	}

	@Override
	public Mesas modifyStatus(int id_mesa, String status) {
		Long id = new Long(id_mesa);
		Mesas mesa = mesaRepo.findOne(id);
		Status stat = statRepo.findByEstado(status);
		mesa.setEstado(stat);
		return mesaRepo.save(mesa);
	}
	


}
