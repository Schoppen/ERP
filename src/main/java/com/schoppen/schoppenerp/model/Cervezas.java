package com.schoppen.schoppenerp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("CERVEZA")
public class Cervezas extends Bebidas{

	private String almacen;

	private String pais_procedencia;
	
	@ManyToOne
	@JoinColumn(name="id_categ1")
	private CATEG1 categoria1;
	
	@ManyToOne
	@JoinColumn(name="id_categ2")
	private CATEG2 categoria2;
	
	@ManyToOne
	@JoinColumn(name="id_categ3")
	private CATEG3 categoria3;
	
	@ManyToOne
	@JoinColumn(name="id_categ4")
	private CATEG4 categoria4;
	
	private String tipo_fermentacion;
	
	@ManyToOne
	@JoinColumn(name="id_familia")
	private Familias familia;
	
	@ManyToOne
	@JoinColumn(name="id_subfamilia")
	private Subfamilias subfamilia;
	
	private double ABV;
	
	private double temperatura_consumo;
	
	private double IBU;
	
	private String lupulos_cereales;
	
	private String lupulos_aromaticos;
	
	private String lupulos_secos;
	
	private String lupulos_dry_hop;
	
	private String maltas_utilizadas;
	
	private boolean refermentada;
	
	private boolean filtrada;
	
	private boolean pasteurizada;
	
	private int cosecha;
	
	private String WBA;

	
	
	// **** GETTERS & SETTERS **** \\
	
	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public String getPais_procedencia() {
		return pais_procedencia;
	}

	public void setPais_procedencia(String pais_procedencia) {
		this.pais_procedencia = pais_procedencia;
	}

	public CATEG1 getCategoria1() {
		return categoria1;
	}

	public void setCategoria1(CATEG1 categoria1) {
		this.categoria1 = categoria1;
	}

	public CATEG2 getCategoria2() {
		return categoria2;
	}

	public void setCategoria2(CATEG2 categoria2) {
		this.categoria2 = categoria2;
	}

	public CATEG3 getCategoria3() {
		return categoria3;
	}

	public void setCategoria3(CATEG3 categoria3) {
		this.categoria3 = categoria3;
	}

	public CATEG4 getCategoria4() {
		return categoria4;
	}

	public void setCategoria4(CATEG4 categoria4) {
		this.categoria4 = categoria4;
	}

	public String getTipo_fermentacion() {
		return tipo_fermentacion;
	}

	public void setTipo_fermentacion(String tipo_fermentacion) {
		this.tipo_fermentacion = tipo_fermentacion;
	}

	public Familias getFamilia() {
		return familia;
	}

	public void setFamilia(Familias familia) {
		this.familia = familia;
	}

	public Subfamilias getSubfamilia() {
		return subfamilia;
	}

	public void setSubfamilia(Subfamilias subfamilia) {
		this.subfamilia = subfamilia;
	}

	public double getABV() {
		return ABV;
	}

	public void setABV(double aBV) {
		ABV = aBV;
	}

	public double getTemperatura_consumo() {
		return temperatura_consumo;
	}

	public void setTemperatura_consumo(double temperatura_consumo) {
		this.temperatura_consumo = temperatura_consumo;
	}

	public double getIBU() {
		return IBU;
	}

	public void setIBU(double iBU) {
		IBU = iBU;
	}

	public String getLupulos_cereales() {
		return lupulos_cereales;
	}

	public void setLupulos_cereales(String lupulos_cereales) {
		this.lupulos_cereales = lupulos_cereales;
	}

	public String getLupulos_aromaticos() {
		return lupulos_aromaticos;
	}

	public void setLupulos_aromaticos(String lupulos_aromaticos) {
		this.lupulos_aromaticos = lupulos_aromaticos;
	}

	public String getLupulos_secos() {
		return lupulos_secos;
	}

	public void setLupulos_secos(String lupulos_secos) {
		this.lupulos_secos = lupulos_secos;
	}

	public String getLupulos_dry_hop() {
		return lupulos_dry_hop;
	}

	public void setLupulos_dry_hop(String lupulos_dry_hop) {
		this.lupulos_dry_hop = lupulos_dry_hop;
	}

	public String getMaltas_utilizadas() {
		return maltas_utilizadas;
	}

	public void setMaltas_utilizadas(String maltas_utilizadas) {
		this.maltas_utilizadas = maltas_utilizadas;
	}

	public boolean isRefermentada() {
		return refermentada;
	}

	public void setRefermentada(boolean refermentada) {
		this.refermentada = refermentada;
	}

	public boolean isFiltrada() {
		return filtrada;
	}

	public void setFiltrada(boolean filtrada) {
		this.filtrada = filtrada;
	}

	public boolean isPasteurizada() {
		return pasteurizada;
	}

	public void setPasteurizada(boolean pasteurizada) {
		this.pasteurizada = pasteurizada;
	}

	public int getCosecha() {
		return cosecha;
	}

	public void setCosecha(int cosecha) {
		this.cosecha = cosecha;
	}

	public String getWBA() {
		return WBA;
	}

	public void setWBA(String wBA) {
		WBA = wBA;
	}
	
}
