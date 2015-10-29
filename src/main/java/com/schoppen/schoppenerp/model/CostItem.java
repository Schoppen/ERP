package com.schoppen.schoppenerp.model;


public class CostItem extends LightItem{

	private double coste_bruto;
	
	private double coste_neto;
	
	private double precio_bruto;
	
	private double precio_neto;

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
	
}
