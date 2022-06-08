package com.idat.EC1.service;

import java.util.List;

import com.idat.EC1.model.Malla_curricular;

public interface Malla_curricularService {

	void guardarMallaCurricular(Malla_curricular malla);
	void actualizarMallaCurricular(Malla_curricular malla);
	void eliminarMallaCurricular(Integer id);
	List<Malla_curricular> listarMallaCurricular();
	Malla_curricular obtenerMallaCurricularId(Integer id);
}
