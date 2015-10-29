package com.schoppen.schoppenerp.model;

import java.sql.Blob;

public class MedItem extends CostItem{

	private float descuento;
	
	private Impuestos impuestos;
	
	private Tamanos tamano;
	
	private Blob preview_img;

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
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

	public Blob getPreview_img() {
		return preview_img;
	}

	public void setPreview_img(Blob preview_img) {
		this.preview_img = preview_img;
	}
	
}
