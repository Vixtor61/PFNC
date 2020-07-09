package com.uca.capas.pfnc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.domain.Cursa;



public interface CursaRepository extends JpaRepository<Cursa, Integer>{
	List<Cursa> findByAlumnoAlumnoId(Integer alumnoId);
	Cursa findByAlumnoAlumnoIdAndMateriaMateriaId(Integer alumnoId, Integer materiaId);
	

}
