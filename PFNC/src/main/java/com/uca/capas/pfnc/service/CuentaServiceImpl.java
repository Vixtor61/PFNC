package com.uca.capas.pfnc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DataAccessException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.repositories.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService {
	@Autowired
	CuentaRepository cuentaRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public Optional<Cuenta> findByUsername(String username) throws DataAccessException {
		// TODO Auto-generated method stub
		return cuentaRepository.findByUsername(username);
	}
	
	@Override
	public void save(Cuenta cuenta) throws DataAccessException {
		// TODO Auto-generated method stub
		cuenta.setPassword(passwordEncoder.encode(cuenta.getPassword()));
	
		cuentaRepository.save(cuenta);
		
	}

}
