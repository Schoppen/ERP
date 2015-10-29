package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Impuestos {
	
	@Id
	@GeneratedValue
	private Long id_impuesto;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private float valor;

	@JsonBackReference
	@OneToMany(mappedBy="impuestos")
	private Set<Items> items_relacionados = new HashSet<Items>();
	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_impuesto() {
		return id_impuesto;
	}

	public void setId_impuesto(Long id_impuesto) {
		this.id_impuesto = id_impuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Set<Items> getItems_relacionados() {
		return items_relacionados;
	}

	public void setItems_relacionados(Set<Items> items_relacionados) {
		this.items_relacionados = items_relacionados;
	}
}
