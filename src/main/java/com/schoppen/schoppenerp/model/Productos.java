package com.schoppen.schoppenerp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("PRODUCTO")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_prod", discriminatorType = DiscriminatorType.STRING)
public class Productos extends Items{
	
	@Column(nullable=false)
	private int cantidad_stock;
	
	@Column(nullable=false)
	private boolean disponible;
	
	@Column(nullable=false)
	private int numero_lote;
	
	@Temporal(TemporalType.DATE)
	private Date fecha_caducidad;
	
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	private Proveedores proveedor;

	@Column(nullable=false)
	private String tipo_prod;
	
	
	
	
	// **** GETTERS & SETTERS **** \\	

	public int getCantidad_stock() {
		return cantidad_stock;
	}

	public void setCantidad_stock(int cantidad_stock) {
		this.cantidad_stock = cantidad_stock;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getNumero_lote() {
		return numero_lote;
	}

	public void setNumero_lote(int numero_lote) {
		this.numero_lote = numero_lote;
	}

	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public String getTipo_prod() {
		return tipo_prod;
	}

	public void setTipo_prod(String tipo_prod) {
		this.tipo_prod = tipo_prod;
	}
}
