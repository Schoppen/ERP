package com.schoppen.schoppenerp.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo", discriminatorType = DiscriminatorType.STRING)
public class Items {

	@Id
	@GeneratedValue
	private Long id_item;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String descripcion;
	
	@Column(nullable=false)
	private String tipo;
	
	@Column(nullable=false)
	private double coste_bruto;
	
	@Column(nullable=false)
	private double coste_neto;
	
	@Column(nullable=false)
	private double precio_bruto;
	
	@Column(nullable=false)
	private double precio_neto;
	
	@Column(nullable=false)
	private double pvp;
	
	private float descuento;
	
	@Temporal(TemporalType.DATE)
	private Date fecha_ultima_consumicion;
	
	@ManyToOne
	@JoinColumn(name="id_impuesto")
	private Impuestos impuestos;
	
	@ManyToOne
	@JoinColumn(name="id_tamano")
	private Tamanos tamano;
	
	@OneToMany(mappedBy="item_agregado")
	private Set<Pedidos> pedidos_incluido = new HashSet<Pedidos>();
	
	
	
	
/*	@ManyToMany(mappedBy="items_tickets")
	private Set<Tickets> tickets_vendidos = new HashSet<Tickets>();
	*/
	
	// **** GETTERS & SETTERS **** \\

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getCoste_bruto() {
		return coste_bruto;
	}

	public void setCoste_bruto(double coste_bruto) {
		this.coste_bruto = coste_bruto;
	}

	public double getCoste_neto() {
		return coste_neto;
	}

	public void setCoste_neto(double coste_neto) {
		this.coste_neto = coste_neto;
	}

	public double getPrecio_bruto() {
		return precio_bruto;
	}

	public void setPrecio_bruto(double precio_bruto) {
		this.precio_bruto = precio_bruto;
	}

	public double getPrecio_neto() {
		return precio_neto;
	}

	public void setPrecio_neto(double precio_neto) {
		this.precio_neto = precio_neto;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public Date getFecha_ultima_consumicion() {
		return fecha_ultima_consumicion;
	}

	public void setFecha_ultima_consumicion(Date fecha_ultima_consumicion) {
		this.fecha_ultima_consumicion = fecha_ultima_consumicion;
	}

	public Impuestos getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(Impuestos impuestos) {
		this.impuestos = impuestos;
	}

	public Tamanos getTamano() {
		return tamano;
	}

	public void setTamano(Tamanos tamano) {
		this.tamano = tamano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getId_item() {
		return id_item;
	}

	public void setId_item(Long id_item) {
		this.id_item = id_item;
	}	
}
