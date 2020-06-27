package com.uca.capas.pfnc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.repositories.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService {
	@Autowired
	CuentaRepository cuentaRepository;
	@Override
	public Cuenta findByUsername(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return cuentaRepository.findByUsername(username);
	}
}
