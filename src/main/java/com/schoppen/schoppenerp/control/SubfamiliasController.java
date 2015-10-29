package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.SubfamiliasRepository;
import com.schoppen.schoppenerp.model.Subfamilias;

@Controller
@RequestMapping("/api/cervezas/subfamilias")
public class SubfamiliasController {
	
	@Autowired
	private SubfamiliasRepository repo;
	
	/*							U R L S
	 * "/api/cervezas/subfamilias" 				.GET 		=>		Todas las Subfamilias
	 * "/api/cervezas/subfamilias/[id]" 		.GET 		=>		Subfamilias [id]
	 * "/api/cervezas/subfamilias/[id]"			.DELETE		=>		Borra la subfamilia
	 * "/api/cervezas/subfamilias/[id]"			.POST		=>		Nueva subfamilia
	 * "/api/cervezas/subfamilias/[id]"			.PUT		=>		Modificar subfamilia
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Subfamilias> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Subfamilias getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Subfamilias delete(@PathVariable("id") Long id) {
		Subfamilias subfam = null;
		try {
			subfam = repo.findOne(id);
		} catch (Exception ex) {
			return subfam;
		}
		repo.delete(subfam);
		return subfam;
	}
	
	// Crear nuevo registro
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Subfamilias create(@RequestParam("name") String nombre){
		Subfamilias fam = new Subfamilias();
		fam.setSubfamilia(nombre);
		return repo.save(fam);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody Subfamilias update(@PathVariable("id") Long id, @RequestParam("name") String nombre){
		Subfamilias subfam = null;
		try {
			subfam = repo.findOne(id);
		} catch (Exception ex) {
			return subfam;
		}
		subfam.setSubfamilia(nombre);
		return repo.save(subfam);
	}
}
