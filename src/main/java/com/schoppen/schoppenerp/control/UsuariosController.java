package com.schoppen.schoppenerp.control;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoppen.schoppenerp.dao.UsuariosRepository;
import com.schoppen.schoppenerp.model.Usuarios;

@Controller
@RequestMapping("/api/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository repo;

	/*							U R L S
	 * "/api/usuarios" 							.GET 		=>		Usuarios activos
	 * "/api/usuarios/[cuenta]" 				.GET 		=>		Usuario [cuenta]
	 * "/api/usuarios/all"						.GET		=>		Todos los usuarios
	 * "/api/usuarios/[cuenta]"					.DELETE		=>		Borra la [cuenta]
	 * "/api/usuarios"							.POST		=>		Nuevo usuario
	 * "/api/usuarios/[cuenta]"					.PUT		=>		Da de baja la [cuenta]
	 * "/api/usuarios/[cuenta]/pwd?pwd=[pass]"	.PUT		=>		Cambia la contraseña
	 */
	
	// Obtener los usuarios ACTIVOS
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<Usuarios> get() {
		return repo.findByActivo(true);
	}	
	
	// Obtener usuario
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Usuarios getOne(@PathVariable("id") String acc) {
		return repo.findOne(acc);
	}
	
	// Obtener todos los usuarios
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public @ResponseBody Set<Usuarios> getAll() {
		return repo.findAll();
	}	
	
	// Borrar usuario
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Usuarios delete(@PathVariable("id") String acc) {
		Usuarios usu = null;
		try {
			usu = repo.findOne(acc);
		} catch (Exception ex) {
			return usu;
		}
		repo.delete(usu);
		return usu;
	}	
	
	// Crear nuevo usuario
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Usuarios create(
			@RequestParam("cuenta") String cuenta,
			@RequestParam("pwd") String pwd,
			@RequestParam("nom") String nom){
		// Validación de cuenta - JavaScript
		Usuarios usu = new Usuarios();
		Date dt = new Date();
		usu.setCuenta(cuenta);
		usu.setContrasena(pwd);
		usu.setNombre(nom);
		usu.setFecha_alta(dt);
		usu.setActivo(true);
		return repo.save(usu);
	}
	
	// Baja usuario
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Usuarios update(@PathVariable("id") String acc) {
		Usuarios usu = null;
		try {
			usu = repo.findOne(acc);
		} catch (Exception ex) {
			return usu;
		}
		Date dt = new Date();
		usu.setFecha_baja(dt);
		usu.setActivo(false);
		return usu;
	}
	
	// Modificar contraseña usuario
	@RequestMapping(value = "/{id}/pwd", method = RequestMethod.PUT)
	public @ResponseBody Usuarios updatePwd(@PathVariable("id") String acc,
			@RequestParam("pwd") String pwd) {
		Usuarios usu = null;
		try {
			usu = repo.findOne(acc);
		} catch (Exception ex) {
			return usu;
		}
		usu.setContrasena(pwd);
		return repo.save(usu);
	}
}
