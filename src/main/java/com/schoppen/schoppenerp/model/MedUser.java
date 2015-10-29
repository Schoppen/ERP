package com.schoppen.schoppenerp.model;

public class MedUser extends LightUser {
	
	private String contrasena;
	
	private boolean activo;

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
