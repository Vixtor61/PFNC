package com.uca.capas.pfnc.service;

import java.util.Optional;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.domain.Cursa;

public interface CuentaService {
	 public Optional<Cuenta> findByUsername(String username) throws DataAccessException;

}
