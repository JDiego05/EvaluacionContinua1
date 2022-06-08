package com.idat.EC1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EC1.model.Malla_curricular;
import com.idat.EC1.repository.Malla_curricularRepository;

public class Malla_curricularServiceImpl implements Malla_curricularService {
	
	@Autowired
	private Malla_curricularRepository repository;

	@Override
	public void guardarMallaCurricular(Malla_curricular malla) {
		repository.save(malla);
	}

	@Override
	public void actualizarMallaCurricular(Malla_curricular malla) {
		repository.saveAndFlush(malla);
	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Malla_curricular> listarMallaCurricular() {
		return repository.findAll();
	}

	@Override
	public Malla_curricular obtenerMallaCurricularId(Integer id) {
		return repository.getById(id);
	}

}
