package com.uca.capas.pfnc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.pfnc.domain.Alumno;


public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	
 	 List<Alumno> findByNombreLikeOrApellidoLike(String nombre,String apellido);
 	 List<Alumno> findByNombreContainingIgnoreCaseOrApellidoContainingIgnoreCase(String nombre,String apellido);
 	 
}
