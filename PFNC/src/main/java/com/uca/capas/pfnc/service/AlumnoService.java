package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.dto.AlumnoPromedioDTO;


public interface AlumnoService {
	public List<Alumno> findAll() throws DataAccessException;
	public List<AlumnoPromedioDTO> findByNombreOrApelPromedio(String nombre) throws DataAccessException;
	public Alumno findOne(Integer id) throws DataAccessException;
	public void save(Alumno alumno) throws DataAccessException;
	public List<Alumno> findByNombreOrApel(String nombre) throws DataAccessException;

}
