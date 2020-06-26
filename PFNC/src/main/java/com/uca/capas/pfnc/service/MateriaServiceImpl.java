package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Materia;
import com.uca.capas.pfnc.domain.Municipio;
import com.uca.capas.pfnc.repositories.MateriaRepository;

@Service
public class MateriaServiceImpl implements MateriaService{
	@Autowired 
	MateriaRepository materiaRepository;
	
	@Override
	public List<Materia> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return materiaRepository.findAll();
	}
	@Override
	public Materia findOne(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return materiaRepository.getOne(id);
	}
	@Override
	public void save(Materia materia) throws DataAccessException {
		// TODO Auto-generated method stub
		materiaRepository.save(materia);
	}
	
	

}
