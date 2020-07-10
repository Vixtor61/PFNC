package com.uca.capas.pfnc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.pfnc.domain.Departamento;
import com.uca.capas.pfnc.domain.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer>{
		List<Municipio> findByDepartamentoDepartamentoId(Integer departamentoId);
	

}
