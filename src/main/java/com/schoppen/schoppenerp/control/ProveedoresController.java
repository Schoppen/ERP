package com.schoppen.schoppenerp.control;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.ProveedoresRepository;
import com.schoppen.schoppenerp.model.Proveedores;

@Controller
@RequestMapping("/api/productos/proveedores")
public class ProveedoresController {

	@Autowired
	private ProveedoresRepository repo;
	
	/*							U R L S
	 * "/api/proveedores" 						.GET 		=>		Todas los proveedores
	 * "/api/proveedores/[id]" 					.GET 		=>		Proveedor [id]
	 * "/api/proveedores/[id]"					.DELETE		=>		Borra el proveedor
	 * "/api/proveedores/[id]"					.POST		=>		Nuevo proveedor
	 * "/api/proveedores/[id]"		...			.PUT		=>		Modificar nombre
	 */
	
	
	// Obtener todos los registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Proveedores> getAll() {
		return repo.findAll();
	}	
	
	// Obtener registro
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Proveedores getOne(@PathVariable("id") Long id) {
		return repo.findOne(id);
	}
	
	// Borrar registro
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Proveedores delete(@PathVariable("id") Long id) {
		Proveedores mesa = null;
		try {
			mesa = repo.findOne(id);
		} catch (Exception ex) {
			return mesa;
		}
		repo.delete(mesa);
		return mesa;
	}
	
	// Crear nuevo registro
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Proveedores create(@RequestParam("name") String empresa){
		Proveedores proveedor = new Proveedores();
		proveedor.setEmpresa(empresa);
		return repo.save(proveedor);
	}
	
	// Modificar registro
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public @ResponseBody Proveedores update(@PathVariable("id") Long id, @RequestParam("name") String nombre){
		Proveedores prov = null;
		try {
			prov = repo.findOne(id);
		} catch (Exception ex) {
			return prov;
		}
		prov.setEmpresa(nombre);
		return repo.save(prov);
	}
}
