package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CATEG3 {

	@Id
	@GeneratedValue
	private Long id_categ3;
	
	@Column(nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="categoria3")
	private Set<Cervezas> cervezas_tercera_categoria = new HashSet<Cervezas>();

	

	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_categ3() {
		return id_categ3;
	}

	public void setId_categ3(Long id_categ3) {
		this.id_categ3 = id_categ3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Cervezas> getCervezas_tercera_categoria() {
		return cervezas_tercera_categoria;
	}

	public void setCervezas_tercera_categoria(Set<Cervezas> cervezas_tercera_categoria) {
		this.cervezas_tercera_categoria = cervezas_tercera_categoria;
	}
}
