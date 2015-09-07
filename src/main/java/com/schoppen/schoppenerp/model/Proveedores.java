package com.schoppen.schoppenerp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Proveedores {

	@Id
	@GeneratedValue
	private Long id_proveedor;
	
	@Column(nullable=false)
	private String empresa;


	
	
	// **** GETTERS & SETTERS **** \\	
	
	public Long getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Long id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
