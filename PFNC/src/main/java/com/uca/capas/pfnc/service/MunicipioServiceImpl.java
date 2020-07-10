package com.uca.capas.pfnc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Municipio;

import com.uca.capas.pfnc.dto.MunicipioDTO;
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
	
	@Override
	public List<MunicipioDTO> findByDeptId(Integer departamentoId) throws DataAccessException {
		// TODO Auto-generated method stub
		
		List<MunicipioDTO> municipios= municipioRepository.findByDepartamentoDepartamentoId(departamentoId).stream().map(m ->{
			MunicipioDTO dto  = new MunicipioDTO();
			dto.setMunicipioId(m.getMunicipioId());
			dto.setNombre(m.getNombre());
			return dto;
		}).collect(Collectors.toList());
		return municipios;
	}
}
