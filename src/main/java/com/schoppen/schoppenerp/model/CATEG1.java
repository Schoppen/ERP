package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class CATEG1 {

	@Id
	@GeneratedValue
	private Long id_categ1;
	
	@Column(nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="categoria1")
	private Set<Cervezas> cervezas_primera_categoria = new HashSet<Cervezas>();

	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_categ1() {
		return id_categ1;
	}

	public void setId_categ1(Long id_categ1) {
		this.id_categ1 = id_categ1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Cervezas> getCervezas_primera_categoria() {
		return cervezas_primera_categoria;
	}

	public void setCervezas_primera_categoria(Set<Cervezas> cervezas_primera_categoria) {
		this.cervezas_primera_categoria = cervezas_primera_categoria;
	}
}
