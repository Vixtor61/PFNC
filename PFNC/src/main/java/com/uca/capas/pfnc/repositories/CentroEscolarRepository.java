package com.uca.capas.pfnc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.domain.Municipio;



public interface CentroEscolarRepository extends JpaRepository<CentroEscolar, Integer>{
			List<CentroEscolar> findByMunicipioMunicipioId(Integer mun_id);
			List<CentroEscolar> findByMunicipio(Municipio municipio);
			List<CentroEscolar> findByNombre(String nombre);
			
			
		

}
