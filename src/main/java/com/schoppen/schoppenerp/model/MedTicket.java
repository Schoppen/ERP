package com.schoppen.schoppenerp.model;

import java.util.Date;

public class MedTicket extends LightTicket{

	private double IVA_total;
	
	private Date fecha_venta;

	public double getIVA_total() {
		return IVA_total;
	}

	public void setIVA_total(double iVA_total) {
		IVA_total = iVA_total;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	
}