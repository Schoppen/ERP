package com.schoppen.schoppenerp.services;

import java.util.Set;

import com.schoppen.schoppenerp.model.Usuarios;

public interface UsuariosService {
 
	public Set<Usuarios> get();
	
	public Set<Usuarios> getAll();
	
	public Usuarios getOne(String acc_id);
	
	public Usuarios create(String acc, String pwd, String name, String role);
	
	public Usuarios delete(String acc_id);
	
	public Usuarios deactivate(String acc_id);
	
	public Usuarios updatePwd(String acc_id, String new_pwd);
	
	public Usuarios modifyRole(String acc_id, String new_role);
}
