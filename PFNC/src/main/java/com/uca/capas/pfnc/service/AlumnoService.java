package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.Alumno;


public interface AlumnoService {
	public List<Alumno> findAll() throws DataAccessException;
	public Alumno findOne(Integer id) throws DataAccessException;
	public void save(Alumno alumno) throws DataAccessException;

}
