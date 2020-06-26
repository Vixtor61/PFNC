package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.Materia;

public interface MateriaService {
	public List<Materia> findAll() throws DataAccessException;
	public Materia findOne(Integer id) throws DataAccessException;
	public void save(Materia materia) throws DataAccessException;

}
