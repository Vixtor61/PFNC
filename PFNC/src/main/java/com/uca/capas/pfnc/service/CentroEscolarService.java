package com.uca.capas.pfnc.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.domain.Municipio;
import com.uca.capas.pfnc.dto.CentroEscolarDTO;

public interface CentroEscolarService {
	public List<CentroEscolar> findAll() throws DataAccessException;
	public CentroEscolar findOne(Integer id) throws DataAccessException;
	public void save(CentroEscolar centro) throws DataAccessException;
	public List<CentroEscolarDTO> filterByMunicipio(Integer mun_id) throws DataAccessException;
	
}
