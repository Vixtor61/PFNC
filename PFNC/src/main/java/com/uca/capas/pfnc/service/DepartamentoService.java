package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.Departamento;
import com.uca.capas.pfnc.domain.Materia;

public interface DepartamentoService {
	public List<Departamento> findAll() throws DataAccessException;
	public Departamento findOne(Integer id) throws DataAccessException;
	public void save(Departamento departamento) throws DataAccessException;

}
