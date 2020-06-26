package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Municipio;

import com.uca.capas.pfnc.repositories.MunicipioRepository;

@Service
public class MunicipioServiceImpl implements MunicipioService{
	@Autowired
	MunicipioRepository municipioRepository;
	
	@Override
	public List<Municipio> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return municipioRepository.findAll();
	}
	@Override
	public Municipio findOne(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return municipioRepository.getOne(id);
	}
}
