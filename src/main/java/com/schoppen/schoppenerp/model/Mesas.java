package com.schoppen.schoppenerp.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mesas extends LightTable{

	@Id
	private Long num_mesa;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_llegada_cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_salida_cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_cierre_ticket;
	
	private int comensales;
	
	@ManyToOne
	@JoinColumn(name="id_status")
	private Status estado;
	
	@OneToMany(mappedBy="mesa_ocupada")
	private Set<Tickets> tickets_relacionados = new HashSet<Tickets>();

	
	
	// **** GETTERS & SETTERS **** \\


	public Long getNum_mesa() {
		return num_mesa;
	}

	public void setNum_mesa(Long num_mesa) {
		this.num_mesa = num_mesa;
	}

	public Date getFecha_llegada_cliente() {
		return fecha_llegada_cliente;
	}

	public void setFecha_llegada_cliente(Date fecha_llegada_cliente) {
		this.fecha_llegada_cliente = fecha_llegada_cliente;
	}

	public Date getFecha_salida_cliente() {
		return fecha_salida_cliente;
	}

	public void setFecha_salida_cliente(Date fecha_salida_cliente) {
		this.fecha_salida_cliente = fecha_salida_cliente;
	}

	public Date getFecha_cierre_ticket() {
		return fecha_cierre_ticket;
	}

	public void setFecha_cierre_ticket(Date fecha_cierre_ticket) {
		this.fecha_cierre_ticket = fecha_cierre_ticket;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public Status getEstado() {
		return estado;
	}

	public void setEstado(Status estado) {
		this.estado = estado;
	}

	public Set<Tickets> getTickets_relacionados() {
		return tickets_relacionados;
	}

	public void setTickets_relacionados(Set<Tickets> tickets_relacionados) {
		this.tickets_relacionados = tickets_relacionados;
	}

}
