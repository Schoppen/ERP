package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.FamiliasRepository;
import com.schoppen.schoppenerp.model.Familias;

@Controller
@RequestMapping("/api/cervezas/familias")
public class FamiliasController {
	
	@Autowired
	private FamiliasRepository repo;
	
	/*							U R L S
	 * "/api/cervezas/familias" 			.GET 		=>		Todos los familias
	 * "/api/cervezas/familias/[id]" 		.GET 		=>		Familia [id]
	 * "/api/cervezas/familias/[id]"		.DELETE		=>		Borra la familia
	 * "/api/cervezas/familias/[id]"		.POST		=>		Nuevo familia
	 * "/api/cervezas/familias/[id]"		.PUT		=>		Modificar familia
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Familias> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Familias getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Familias delete(@PathVariable("id") Long id) {
		Familias fam = null;
		try {
			fam = repo.findOne(id);
		} catch (Exception ex) {
			return fam;
		}
		repo.delete(fam);
		return fam;
	}
	
	// Crear nuevo registro
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Familias create(@RequestParam("name") String nombre){
		Familias fam = new Familias();
		fam.setFamilia(nombre);
		return repo.save(fam);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody Familias update(@PathVariable("id") Long id, @RequestParam("name") String nombre){
		Familias fam = null;
		try {
			fam = repo.findOne(id);
		} catch (Exception ex) {
			return fam;
		}
		fam.setFamilia(nombre);
		return repo.save(fam);
	}
}
