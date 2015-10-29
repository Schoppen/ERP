package com.schoppen.schoppenerp.handlers;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.schoppen.schoppenerp.dao.UsuariosRepository;
import com.schoppen.schoppenerp.model.Usuarios;
import com.schoppen.schoppenerp.services.UsuariosService;

public class UsuariosManager implements UsuariosService {

	@Autowired
	private UsuariosRepository usuRepo;

	@Override
	public Set<Usuarios> get() {
		return usuRepo.findByActivo(true);
	}

	@Override
	public Set<Usuarios> getAll() {
		return usuRepo.findAll();
	}

	@Override
	public Usuarios getOne(String acc_id) {
		return usuRepo.findOne(acc_id);
	}

	@Override
	public Usuarios create(String acc, String pwd, String name, String role) {
		Usuarios usu = new Usuarios();
		Date dt = new Date();
		usu.setCuenta(acc);
		usu.setContrasena(pwd);
		usu.setNombre(name);
		usu.setRol(role);
		usu.setFecha_alta(dt);
		usu.setActivo(true);
		return usuRepo.save(usu);
	}

	@Override
	public Usuarios delete(String acc_id) {
		Usuarios usu = null;
		try {
			usu = usuRepo.findOne(acc_id);
		} catch (Exception ex) {
			return null;
		}
		usuRepo.delete(usu);
		return usu;
	}

	@Override
	public Usuarios deactivate(String acc_id) {
		Usuarios usu = null;
		try {
			usu = usuRepo.findOne(acc_id);
		} catch (Exception ex) {
			return null;
		}
		Date dt = new Date();
		usu.setFecha_baja(dt);
		usu.setActivo(false);
		return usuRepo.save(usu);
	}

	@Override
	public Usuarios updatePwd(String acc_id, String new_pwd) {
		Usuarios usu = null;
		try {
			usu = usuRepo.findOne(acc_id);
		} catch (Exception ex) {
			return null;
		}
		usu.setContrasena(new_pwd);
		return usuRepo.save(usu);
	}

	@Override
	public Usuarios modifyRole(String acc_id, String new_role) {
		Usuarios usu = null;
		try {
			usu = usuRepo.findOne(acc_id);
		} catch (Exception ex) {
			return null;
		}
		usu.setRol(new_role);
		return usuRepo.save(usu);
	}


}
