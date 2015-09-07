package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CATEG4 {

	@Id
	@GeneratedValue
	private Long id_categ4;
	
	@Column(nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="categoria4")
	private Set<Cervezas> cervezas_cuarta_categoria = new HashSet<Cervezas>();

	

	// **** GETTERS & SETTERS **** \\
	
	public Long getId_categ4() {
		return id_categ4;
	}

	public void setId_categ4(Long id_categ4) {
		this.id_categ4 = id_categ4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Cervezas> getCervezas_cuarta_categoria() {
		return cervezas_cuarta_categoria;
	}

	public void setCervezas_cuarta_categoria(Set<Cervezas> cervezas_cuarta_categoria) {
		this.cervezas_cuarta_categoria = cervezas_cuarta_categoria;
	}
}
