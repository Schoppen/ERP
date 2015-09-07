package com.schoppen.schoppenerp.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("BEBIDA")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_bebida", discriminatorType = DiscriminatorType.STRING)
public class Bebidas extends Productos {

	
	private int uds_caja;
	
	private String tipo_bebida;
	
	private String observaciones;
	
	@ManyToOne
	@JoinColumn(name="id_envase")
	private Envases envase;

	
	
	// **** GETTERS & SETTERS **** \\

	public int getUds_caja() {
		return uds_caja;
	}

	public void setUds_caja(int uds_caja) {
		this.uds_caja = uds_caja;
	}

	public Envases getEnvase() {
		return envase;
	}

	public void setEnvase(Envases envase) {
		this.envase = envase;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTipo_bebida() {
		return tipo_bebida;
	}

	public void setTipo_bebida(String tipo_bebida) {
		this.tipo_bebida = tipo_bebida;
	}
}
