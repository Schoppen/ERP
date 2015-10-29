package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.CATEG4Repository;
import com.schoppen.schoppenerp.model.CATEG4;

@Controller
@RequestMapping("/api/cervezas/categ4")
public class CATEG4Controller {

	@Autowired
	private CATEG4Repository repo;
	
	/*							U R L S
	 * "/api/cervezas/CATEG4" 						.GET 		=>		Todas los CATEG4
	 * "/api/cervezas/CATEG4/[id]" 					.GET 		=>		Proveedor [id]
	 * "/api/cervezas/CATEG4/[id]"					.DELETE		=>		Borra el proveedor
	 * "/api/cervezas/CATEG4/[id]"					.POST		=>		Nuevo proveedor
	 * "/api/cervezas/CATEG4/[id]"					.PUT		=>		Modificar nombre
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<CATEG4> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody CATEG4 getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody CATEG4 delete(@PathVariable("id") Long id) {
		CATEG4 cat = null;
		try {
			cat = repo.findOne(id);
		} catch (Exception ex) {
			return cat;
		}
		repo.delete(cat);
		return cat;
	}
	
	// Crear nuevo registro
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody CATEG4 create(@RequestParam("name") String nombre){
		CATEG4 cat = new CATEG4();
		cat.setNombre(nombre);
		return repo.save(cat);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody CATEG4 update(@PathVariable("id") Long id, @RequestParam("name") String nombre){
		CATEG4 cat = null;
		try {
			cat = repo.findOne(id);
		} catch (Exception ex) {
			return cat;
		}
		cat.setNombre(nombre);
		return repo.save(cat);
	}
}
