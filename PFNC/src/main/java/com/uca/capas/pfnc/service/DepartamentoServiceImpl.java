package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Departamento;
import com.uca.capas.pfnc.repositories.DepartamentoRepository;
import com.uca.capas.pfnc.repositories.MateriaRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	@Autowired 
	DepartamentoRepository departamentoRepository;
	
	
	@Override
	public List<Departamento> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return departamentoRepository.findAll();
	}
	@Override
	public Departamento findOne(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return departamentoRepository.getOne(id);
	}
	@Override
	public void save(Departamento departamento) throws DataAccessException {
		departamentoRepository.save(departamento);
		
	}

}
