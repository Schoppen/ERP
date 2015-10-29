package com.schoppen.schoppenerp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proveedores {

	@Id
	@GeneratedValue
	private Long id_proveedor;
	
	@Column(nullable=false)
	private String empresa;

	@OneToMany(mappedBy="proveedor")
	private Set<Productos> productos_proveidos = new HashSet<Productos>();
	
	
	
	
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

	public Set<Productos> getProductos_proveidos() {
		return productos_proveidos;
	}

	public void setProductos_proveidos(Set<Productos> productos_proveidos) {
		this.productos_proveidos = productos_proveidos;
	}
}
