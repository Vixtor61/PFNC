package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.repositories.AlumnoRepository;
@Service
public class AlumnoServiceImpl implements AlumnoService {
		@Autowired
		AlumnoRepository alumnoRepository;
		
		@Override
		public List<Alumno> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
		}
		
		@Override
		public Alumno findOne(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return alumnoRepository.getOne(id);
		}
}
