package com.schoppen.schoppenerp.model;

import java.sql.Blob;


public class LightItem extends MinimalItem {

	private String descripcion;
	
	private double pvp;
	
	private Blob ico_img;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public Blob getIco_img() {
		return ico_img;
	}

	public void setIco_img(Blob ico_img) {
		this.ico_img = ico_img;
	}
	
}
