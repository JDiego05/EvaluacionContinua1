package com.idat.EC1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EC1.model.Curso;
import com.idat.EC1.model.Universidad;
import com.idat.EC1.repository.UniversidadRepository;

public class UniversidadServiceImpl implements UniversidadService {
	
	@Autowired
	private UniversidadRepository repository;

	@Override
	public void guardarUniversidad(Universidad universidad) {
		repository.save(universidad);
	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		repository.saveAndFlush(universidad);
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Universidad> listarUniversidad() {
		return repository.findAll();
	}

	@Override
	public Universidad obtenerUniversidadId(Integer id) {
		return repository.getById(id);
	}

}
