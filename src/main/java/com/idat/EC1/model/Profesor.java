package com.idat.EC1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Profesor")
@Entity
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProfesor;
	private String profesor;
	
	public Profesor() {
		super();
	}

	public Profesor(int idProfesor, String profesor) {
		super();
		this.idProfesor = idProfesor;
		this.profesor = profesor;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	
}
