package com.uca.capas.pfnc.service;

import java.awt.Cursor;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Cursa;
import com.uca.capas.pfnc.dto.CentroEscolarDTO;
import com.uca.capas.pfnc.repositories.CursaRepository;
import com.uca.capas.pfnc.repositories.MunicipioRepository;

@Service
public class CursaServiceImpl implements CursaService {
	@Autowired
	CursaRepository cursaRepository;
	
	@Override
	public List<Cursa> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return cursaRepository.findAll();
	}
	
	
	@Override
	public Cursa findOne(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return cursaRepository.getOne(id);
	}
	
	@Override
	public void save(Cursa cursa) throws DataAccessException {
		// TODO Auto-generated method stub
		cursaRepository.save(cursa);
	}
	
}
