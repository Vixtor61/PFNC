package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.Municipio;
import com.uca.capas.pfnc.dto.MunicipioDTO;

public interface MunicipioService {
	public List<Municipio> findAll() throws DataAccessException;
	public Municipio findOne(Integer id) throws DataAccessException;
	public List<MunicipioDTO> findByDeptId(Integer departamentoId) throws DataAccessException;
	//public void save(Alumno alumno) throws DataAccessException;

}
