package com.uca.capas.pfnc.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.pfnc.domain.Cuenta;

public interface CuentaRepository  extends JpaRepository<Cuenta, Integer>{
	Optional<Cuenta> findByUsername(String username);

	

}
