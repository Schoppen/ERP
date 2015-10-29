package com.schoppen.schoppenerp.handlers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.ImpuestosRepository;
import com.schoppen.schoppenerp.model.Impuestos;
import com.schoppen.schoppenerp.services.ImpuestosService;

public class ImpuestosManager implements ImpuestosService {

	@Autowired
	private ImpuestosRepository impRepo;
	
	@Override
	public Set<Impuestos> getAll() {
		return impRepo.findAll();
	}

	@Override
	public Impuestos getOne(int id_imp) {
		Long id = new Long(id_imp);
		return impRepo.findOne(id);
	}

	@Override
	public Impuestos create(String nombre, float valor) {
		Impuestos impuesto = new Impuestos();
		impuesto.setNombre(nombre);
		impuesto.setValor(valor);
		return impRepo.save(impuesto);
	}

	@Override
	public Impuestos delete(int id_imp) {
		Long id = new Long(id_imp);
		Impuestos impuesto = impRepo.findOne(id);
		impRepo.delete(impuesto);
		return impuesto;
	}

	@Override
	public Impuestos modifyName(int id_imp, String name) {
		Long id = new Long(id_imp);
		Impuestos impuesto = impRepo.findOne(id);
		impuesto.setNombre(name);
		return impRepo.save(impuesto);
	}

	@Override
	public Impuestos modifyValue(int id_imp, float value) {
		Long id = new Long(id_imp);
		Impuestos impuesto = impRepo.findOne(id);
		impuesto.setValor(value);
		return impRepo.save(impuesto);
	}

}
