package com.uca.capas.pfnc.service;

import java.awt.Cursor;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.domain.Cursa;
import com.uca.capas.pfnc.dto.CentroEscolarDTO;

public interface CursaService {
	public List<Cursa> findAll() throws DataAccessException;
	public Cursa findOne(Integer id) throws DataAccessException;
	public void save(Cursa cursa) throws DataAccessException;
	//public List<CentroEscolarDTO> filterByMunicipio(Integer mun_id) throws DataAccessException;

}
