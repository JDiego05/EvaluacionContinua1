package com.idat.EC1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Universidad")
@Entity
public class Universidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUniversidad;
	private String Universidad;
	
	public Universidad() {

	}

	public Universidad(int idUniversidad, String universidad) {
		this.idUniversidad = idUniversidad;
		Universidad = universidad;
	}

	public int getIdUniversidad() {
		return idUniversidad;
	}

	public void setIdUniversidad(int idUniversidad) {
		this.idUniversidad = idUniversidad;
	}

	public String getUniversidad() {
		return Universidad;
	}

	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
	
}
