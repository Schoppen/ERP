package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Envases {

	@Id
	@GeneratedValue
	private Long id_envase;
	
	@Column(nullable=false)
	private String envase;
	
	@OneToMany(mappedBy="envase")
	private Set<Bebidas> bebidas_relacionadas = new HashSet<Bebidas>();

	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_envase() {
		return id_envase;
	}

	public void setId_envase(Long id_envase) {
		this.id_envase = id_envase;
	}

	public String getEnvase() {
		return envase;
	}

	public void setEnvase(String envase) {
		this.envase = envase;
	}

	public Set<Bebidas> getBebidas_relacionadas() {
		return bebidas_relacionadas;
	}

	public void setBebidas_relacionadas(Set<Bebidas> bebidas_relacionadas) {
		this.bebidas_relacionadas = bebidas_relacionadas;
	}
}
