package com.schoppen.schoppenerp.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tickets extends MedTicket{

	@Id
	@GeneratedValue
	private Long id_ticket;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_venta;
	
	private String nombre_cliente;
	
	private double importe_total;
	
	private double IVA_total;
	
	@ManyToOne
	@JoinColumn(name="id_empleado")
	private Usuarios empleado;
	
	@ManyToOne
	@JoinColumn(name="id_mesa")
	private Mesas mesa_ocupada;

	@OneToMany(mappedBy="ticket_pedido")
	private Set<Pedidos> pedidos = new HashSet<Pedidos>();
	
	
	
/*	@ManyToMany
	@JoinTable(
			name = "tickets_items",
			joinColumns={@JoinColumn(name="id_ticket")},
			inverseJoinColumns={@JoinColumn(name="id_item")}
			)
	private Set<Items> items_ticket = new HashSet<Items>();
	
	*/
	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(Long id_ticket) {
		this.id_ticket = id_ticket;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public double getImporte_total() {
		return importe_total;
	}

	public void setImporte_total(double importe_total) {
		this.importe_total = importe_total;
	}

	public double getIVA_total() {
		return IVA_total;
	}

	public void setIVA_total(double iVA_total) {
		IVA_total = iVA_total;
	}

	public Usuarios getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Usuarios empleado) {
		this.empleado = empleado;
	}

	public Mesas getMesa_ocupada() {
		return mesa_ocupada;
	}

	public void setMesa_ocupada(Mesas mesa_ocupada) {
		this.mesa_ocupada = mesa_ocupada;
	}

}
