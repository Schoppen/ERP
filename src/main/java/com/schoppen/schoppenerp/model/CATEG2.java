package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CATEG2 {

	@Id
	@GeneratedValue
	private Long id_categ2;
	
	@Column(nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="categoria2")
	private Set<Cervezas> cervezas_segunda_categoria = new HashSet<Cervezas>();

	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_categ2() {
		return id_categ2;
	}

	public void setId_categ2(Long id_categ2) {
		this.id_categ2 = id_categ2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Cervezas> getCervezas_segunda_categoria() {
		return cervezas_segunda_categoria;
	}

	public void setCervezas_segunda_categoria(Set<Cervezas> cervezas_segunda_categoria) {
		this.cervezas_segunda_categoria = cervezas_segunda_categoria;
	}
}
