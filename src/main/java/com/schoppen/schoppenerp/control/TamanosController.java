package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.TamanosRepository;
import com.schoppen.schoppenerp.model.Tamanos;

@Controller
@RequestMapping("/api/items/tamanos")
public class TamanosController {

	@Autowired
	private TamanosRepository repo;
	
	/*							U R L S
	 * "/api/items/tamanos" 					.GET 		=>		Todos los tamaños
	 * "/api/items/tamanos/[id]" 				.GET 		=>		Tamaño [id]
	 * "/api/items/tamanos/[id]"				.DELETE		=>		Borra el tamaño
	 * "/api/items/tamanos/[id]"				.POST		=>		Nuevo tamaño
	 * "/api/items/tamanos/[id]"				.PUT		=>		Modificar tamaño
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Tamanos> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Tamanos getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Tamanos delete(@PathVariable("id") Long id) {
		Tamanos tam = null;
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
	public @ResponseBody Tamanos create(@RequestParam("size") String size){
		Tamanos tam = new Tamanos();
		tam.setTamano(size);
		return repo.save(tam);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody Tamanos update(@PathVariable("id") Long id, @RequestParam("size") String size){
		Tamanos tam = null;
		try {
			tam = repo.findOne(id);
		} catch (Exception ex) {
			return tam;
		}
		tam.setTamano(size);
		return repo.save(tam);
	}
}
