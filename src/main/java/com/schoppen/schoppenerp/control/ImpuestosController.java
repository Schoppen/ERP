package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.ImpuestosRepository;
import com.schoppen.schoppenerp.model.Impuestos;

@Controller
@RequestMapping("/api/items/impuestos")
public class ImpuestosController {
	
	@Autowired
	private ImpuestosRepository repo;
	
	/*							U R L S
	 * "/api/items/impuestos" 				.GET 		=>		Todos los impuestos
	 * "/api/items/impuestos/[id]" 			.GET 		=>		Familia [id]
	 * "/api/items/impuestos/[id]"			.DELETE		=>		Borra el impuesto
	 * "/api/items/impuestos/[id]"			.POST		=>		Nuevo impuesto
	 * "/api/items/impuestos/[id]"			.PUT		=>		Modificar impuesto
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Impuestos> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Impuestos getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Impuestos delete(@PathVariable("id") Long id) {
		Impuestos impuesto = null;
		try {
			impuesto = repo.findOne(id);
		} catch (Exception ex) {
			return impuesto;
		}
		repo.delete(impuesto);
		return impuesto;
	}
	
	// Crear nuevo registro
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Impuestos create(@RequestParam("name") String nombre, @RequestParam("value") int valor){
		Impuestos impuesto = new Impuestos();
		impuesto.setNombre(nombre);
		impuesto.setValor(valor);
		return repo.save(impuesto);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody Impuestos update(
			@PathVariable("id") Long id, 
			@RequestParam("name") String nombre, 
			@RequestParam("value") int valor){
		Impuestos impuesto = null;
		try {
			impuesto = repo.findOne(id);
		} catch (Exception ex) {
			return impuesto;
		}
		impuesto.setNombre(nombre);
		impuesto.setValor(valor);
		return repo.save(impuesto);
	}
}
