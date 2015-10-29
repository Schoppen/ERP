package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.StatusRepository;
import com.schoppen.schoppenerp.model.Status;

@Controller
@RequestMapping("/api/mesas/status/")
public class StatusController {

	@Autowired
	private StatusRepository repo;
	
	/*							U R L S
	 * "/api/mesas/status" 						.GET 		=>		Todos los tamaños
	 * "/api/mesas/status/[id]" 				.GET 		=>		Tamaño [id]
	 * "/api/mesas/status/[id]"					.DELETE		=>		Borra el tamaño
	 * "/api/mesas/status/[id]"					.POST		=>		Nuevo tamaño
	 * "/api/mesas/status/[id]"					.PUT		=>		Modificar tamaño
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Status> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Status getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Status delete(@PathVariable("id") Long id) {
		Status tam = null;
		try {
			tam = repo.findOne(id);
		} catch (Exception ex) {
			return tam;
		}
		repo.delete(tam);
		return tam;
	}
	
	// Crear nuevo registro
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Status create(@RequestParam("status") String estado){
		Status stat = new Status();
		stat.setEstado(estado);
		return repo.save(stat);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody Status update(@PathVariable("id") Long id, @RequestParam("status") String estado){
		Status stat = null;
		try {
			stat = repo.findOne(id);
		} catch (Exception ex) {
			return stat;
		}
		stat.setEstado(estado);
		return repo.save(stat);
	}
}
