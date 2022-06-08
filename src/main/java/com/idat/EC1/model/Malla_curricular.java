package com.idat.EC1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Malla_curricular")
@Entity
public class Malla_curricular {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMalla;
	private String anio;
	
	public Malla_curricular() {
		super();
	}

	public Malla_curricular(int idMalla, String anio) {
		super();
		this.idMalla = idMalla;
		this.anio = anio;
	}

	public int getIdMalla() {
		return idMalla;
	}

	public void setIdMalla(int idMalla) {
		this.idMalla = idMalla;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	
	
}
