package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.CATEG1Repository;
import com.schoppen.schoppenerp.handlers.CATEG1Manager;
import com.schoppen.schoppenerp.model.CATEG1;

@Controller
@RequestMapping("/api/cervezas/categ1")
public class CATEG1Controller {

	@Autowired
	private CATEG1Manager manager;
	
	/*							U R L S
	 * "/api/cervezas/CATEG1" 						.GET 		=>		Todas los CATEG1
	 * "/api/cervezas/CATEG1/[id]" 					.GET 		=>		Proveedor [id]
	 * "/api/cervezas/CATEG1/[id]"					.DELETE		=>		Borra el proveedor
	 * "/api/cervezas/CATEG1/[id]"					.POST		=>		Nuevo proveedor
	 * "/api/cervezas/CATEG1/[id]"					.PUT		=>		Modificar nombre
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<CATEG1> getAll() {
		return manager.getAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody CATEG1 getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody CATEG1 delete(@PathVariable("id") Long id) {
		
	}
	
	// Crear nuevo registro
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody CATEG1 create(@RequestParam("name") String nombre){
		CATEG1 cat = new CATEG1();
		cat.setNombre(nombre);
		return repo.save(cat);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody CATEG1 update(@PathVariable("id") Long id, @RequestParam("name") String nombre){
		CATEG1 cat = null;
		try {
			cat = repo.findOne(id);
		} catch (Exception ex) {
			return cat;
		}
		cat.setNombre(nombre);
		return repo.save(cat);
	}
}
