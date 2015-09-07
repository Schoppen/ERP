package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Status {

	@Id
	@GeneratedValue
	private Long id_status;
	
	@Column(nullable=false)
	private String estado;	// libre, ocupado, pagado, reservado
	
	@OneToMany(mappedBy="estado")
	private Set<Mesas> mesas_relacionadas = new HashSet<Mesas>();
	
	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_status() {
		return id_status;
	}

	public void setId_status(Long id_status) {
		this.id_status = id_status;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<Mesas> getMesas_relacionadas() {
		return mesas_relacionadas;
	}

	public void setMesas_relacionadas(Set<Mesas> mesas_relacionadas) {
		this.mesas_relacionadas = mesas_relacionadas;
	}
}
