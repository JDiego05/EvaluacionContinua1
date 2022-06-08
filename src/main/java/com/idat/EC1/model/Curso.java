package com.idat.EC1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Curso")
@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;
	private String curso;
	private String descripcion;
	private int idMalla;
	
	public Curso() {
		super();
	}

	public Curso(int idCurso, String curso, String descripcion, int idMalla) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		this.idMalla = idMalla;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdMalla() {
		return idMalla;
	}

	public void setIdMalla(int idMalla) {
		this.idMalla = idMalla;
	}
	
	
	
}
