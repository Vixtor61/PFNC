package com.uca.capas.pfnc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.domain.Municipio;
import com.uca.capas.pfnc.dto.CentroEscolarDTO;
import com.uca.capas.pfnc.repositories.CentroEscolarRepository;

@Service
public class CentroEscolarServiceImpl implements CentroEscolarService{
	@Autowired
	CentroEscolarRepository centroEscolarRepository;
	
	@Override
	public List<CentroEscolar> findAll() throws DataAccessException {
	// TODO Auto-generated method stub
	return centroEscolarRepository.findAll();
	}
	
	@Override
	public CentroEscolar findOne(Integer id) throws DataAccessException {
	// TODO Auto-generated method stub
	return centroEscolarRepository.getOne(id);
	}

	@Override
	public void save(CentroEscolar centro) throws DataAccessException {
		centroEscolarRepository.save(centro);
	
	}
	
	
	@Override
	public List<CentroEscolarDTO> filterByMunicipio(Integer mun_id) throws DataAccessException {
		// TODO Auto-generated method stub
		
		List<CentroEscolarDTO> centros = centroEscolarRepository.findByMunicipioMunicipioId(mun_id).stream().map(c ->{
			CentroEscolarDTO dto  = new CentroEscolarDTO();
			dto.setCentroEscolarId(c.getCentroEscolarId());
			dto.setNombre(c.getNombre());
			return dto;
		}).collect(Collectors.toList());
		return centros;
	}
	


}
