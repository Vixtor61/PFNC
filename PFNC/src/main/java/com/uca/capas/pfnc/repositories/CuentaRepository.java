package com.uca.capas.pfnc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.pfnc.domain.Cuenta;

public interface CuentaRepository  extends JpaRepository<Cuenta, Integer>{
	Cuenta findByUsername(String username);
	

}
