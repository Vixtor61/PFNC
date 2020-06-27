package com.uca.capas.pfnc.service;

import org.springframework.dao.DataAccessException;

import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.domain.Cursa;

public interface CuentaService {
	 public Cuenta findByUsername(String username) throws DataAccessException;

}
