package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tamanos {

	@Id
	@GeneratedValue
	private Long id_tamano;
	
	@Column(nullable=false)
	private String tamano;

	@OneToMany(mappedBy="tamano")
	private Set<Items> items_relacionados = new HashSet<Items>();
	
	
	// **** GETTERS & SETTERS **** \\

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public Long getId_tamano() {
		return id_tamano;
	}

	public void setId_tamano(Long id_tamano) {
		this.id_tamano = id_tamano;
	}

	public Set<Items> getItems_relacionados() {
		return items_relacionados;
	}

	public void setItems_relacionados(Set<Items> items_relacionados) {
		this.items_relacionados = items_relacionados;
	}
}
