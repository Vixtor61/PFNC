package com.uca.capas.pfnc.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uca.capas.pfnc.dto.CentroEscolarDTO;
import com.uca.capas.pfnc.dto.MunicipioDTO;
import com.uca.capas.pfnc.service.CentroEscolarService;
import com.uca.capas.pfnc.service.MunicipioService;

@RestController
@RequestMapping("/api")
public class RestApi {
	@Autowired
	CentroEscolarService centroEscolarService;
	
	@Autowired
	MunicipioService municipioService;
	

	// Filtrar centros escolares por municipio
	@RequestMapping(value = "/getCentrosbyMunicipio", method = RequestMethod.GET)
	public @ResponseBody List<CentroEscolarDTO> getClientesFechaEstado(@RequestParam Integer municipioId)
			throws ParseException {
		
		List<CentroEscolarDTO> clientes = centroEscolarService.filterByMunicipio(municipioId);

		return clientes;
	}
	
	@RequestMapping(value = "/getMunicipiosByDept", method = RequestMethod.GET)
	public @ResponseBody List<MunicipioDTO> getMunicipiosByDept(@RequestParam Integer departamentoId)
			throws ParseException {
		
		List<MunicipioDTO> municipioDTOs = municipioService.findByDeptId(departamentoId);

		return municipioDTOs;
	}

}
