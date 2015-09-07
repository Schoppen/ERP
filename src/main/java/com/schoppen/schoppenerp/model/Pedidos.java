package com.schoppen.schoppenerp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tickets_items")
public class Pedidos {
	
	@Id
	@GeneratedValue
	private Long id_pedido;
	
	@ManyToOne
	@JoinColumn(name="id_ticket")
	private Tickets ticket_pedido;
	
	@ManyToOne
	@JoinColumn(name="id_item")
	private Items item_agregado;
	
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuarios empleado;

	
	
	// **** GETTERS & SETTERS **** \\
	
	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Tickets getTicket_pedido() {
		return ticket_pedido;
	}

	public void setTicket_pedido(Tickets ticket_pedido) {
		this.ticket_pedido = ticket_pedido;
	}

	public Items getItem_agregado() {
		return item_agregado;
	}

	public void setItem_agregado(Items item_agregado) {
		this.item_agregado = item_agregado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Usuarios getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Usuarios empleado) {
		this.empleado = empleado;
	}
}
