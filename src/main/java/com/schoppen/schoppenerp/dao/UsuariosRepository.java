package com.schoppen.schoppenerp.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoppen.schoppenerp.model.Usuarios;


@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, String> {

	public Set<Usuarios> findAll();	
	
	public Set<Usuarios> findByActivo(Boolean activo);
}
