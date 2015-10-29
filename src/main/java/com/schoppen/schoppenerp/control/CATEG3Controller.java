package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.CATEG3Repository;
import com.schoppen.schoppenerp.model.CATEG3;

@Controller
@RequestMapping("/api/cervezas/categ3")
public class CATEG3Controller{

	@Autowired
	private CATEG3Repository repo;
	
	/*							U R L S
	 * "/api/cervezas/CATEG3" 						.GET 		=>		Todas los CATEG3
	 * "/api/cervezas/CATEG3/[id]" 					.GET 		=>		Proveedor [id]
	 * "/api/cervezas/CATEG3/[id]"					.DELETE		=>		Borra el proveedor
	 * "/api/cervezas/CATEG3/[id]"					.POST		=>		Nuevo proveedor
	 * "/api/cervezas/CATEG3/[id]"					.PUT		=>		Modificar nombre
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<CATEG3> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody CATEG3 getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody CATEG3 delete(@PathVariable("id") Long id) {
		CATEG3 cat = null;
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
	public @ResponseBody CATEG3 create(@RequestParam("name") String nombre){
		CATEG3 cat = new CATEG3();
		cat.setNombre(nombre);
		return repo.save(cat);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody CATEG3 update(@PathVariable("id") Long id, @RequestParam("name") String nombre){
		CATEG3 cat = null;
		try {
			cat = repo.findOne(id);
		} catch (Exception ex) {
			return cat;
		}
		cat.setNombre(nombre);
		return repo.save(cat);
	}
}
