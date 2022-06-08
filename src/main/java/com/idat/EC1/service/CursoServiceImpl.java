package com.idat.EC1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EC1.model.Curso;
import com.idat.EC1.repository.CursoRepository;

public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	@Override
	public void guardarCurso(Curso curso) {
		repository.save(curso);
	}

	@Override
	public void actualizarCurso(Curso curso) {
		repository.saveAndFlush(curso);
	}

	@Override
	public void eliminarCurso(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Curso> listarCurso() {
		return repository.findAll();
	}

	@Override
	public Curso obtenerCursoId(Integer id) {
		return repository.getById(id);
	}

}
