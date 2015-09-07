package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subfamilias {
	@Id
	@GeneratedValue
	private Long id_subfamilia;
	
	@Column(nullable=false)
	private String subfamilia;
	
	@OneToMany(mappedBy="subfamilia")
	private Set<Cervezas> cervezas_subrelacionadas = new HashSet<Cervezas>();

	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_subfamilia() {
		return id_subfamilia;
	}

	public void setId_subfamilia(Long id_subfamilia) {
		this.id_subfamilia = id_subfamilia;
	}

	public String getSubfamilia() {
		return subfamilia;
	}

	public void setSubfamilia(String subfamilia) {
		this.subfamilia = subfamilia;
	}

	public Set<Cervezas> getCervezas_subrelacionadas() {
		return cervezas_subrelacionadas;
	}

	public void setCervezas_subrelacionadas(Set<Cervezas> cervezas_subrelacionadas) {
		this.cervezas_subrelacionadas = cervezas_subrelacionadas;
	}
}
