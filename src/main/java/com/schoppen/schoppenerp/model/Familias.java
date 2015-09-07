package com.schoppen.schoppenerp.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Familias {

	@Id
	@GeneratedValue
	private Long id_familia;
	
	@Column(nullable=false)
	private String familia;
	
	@OneToMany(mappedBy="familia")
	private Set<Cervezas> cervezas_relacionadas = new HashSet<Cervezas>();

	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_familia() {
		return id_familia;
	}

	public void setId_familia(Long id_familia) {
		this.id_familia = id_familia;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public Set<Cervezas> getCervezas_relacionadas() {
		return cervezas_relacionadas;
	}

	public void setCervezas_relacionadas(Set<Cervezas> cervezas_relacionadas) {
		this.cervezas_relacionadas = cervezas_relacionadas;
	}

}
