package com.uca.capas.pfnc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.domain.Cursa;
import com.uca.capas.pfnc.dto.AlumnoPromedioDTO;
import com.uca.capas.pfnc.dto.CentroEscolarDTO;
import com.uca.capas.pfnc.repositories.AlumnoRepository;
@Service
public class AlumnoServiceImpl implements AlumnoService {
		@Autowired
		AlumnoRepository alumnoRepository;
		
		@Override
		public List<Alumno> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
		}
		
		@Override
		public Alumno findOne(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return alumnoRepository.getOne(id);
		}

		@Override
		public void save(Alumno alumno) throws DataAccessException {
			alumnoRepository.save(alumno);
		
		}
		
		@Override
		public List<Alumno> findByNombreOrApel(String nombre) throws DataAccessException {
		// TODO Auto-generated method stub
		return alumnoRepository.findByNombreContainingIgnoreCaseOrApellidoContainingIgnoreCase(nombre,nombre);
		}
		
		@Override
		public List<AlumnoPromedioDTO> findByNombreOrApelPromedio(String nombre) throws DataAccessException {
		// TODO Auto-generated method stub
			List<AlumnoPromedioDTO> alumnos = alumnoRepository.findByNombreContainingIgnoreCaseOrApellidoContainingIgnoreCase(nombre,nombre).stream().map(a ->{
				AlumnoPromedioDTO dto  = new AlumnoPromedioDTO();
				dto.setAlumnoId(a.getAlumnoId());
				dto.setNombre(a.getNombre());
				dto.setApellido(a.getApellido());
				Double promedio = 0d;
				Integer aprovadas = 0;
				Integer reprovadas = 0;
				//calculate alumno data
				for (Cursa cursa : a.getCursas()){
				    if(cursa.getNota() < 6) {
				    	reprovadas++;
				    }else {
				    	aprovadas++;
				    }
				    promedio += cursa.getNota();
				}
				promedio = promedio / a.getCursas().size();
				
				dto.setAprovadas(aprovadas);
				dto.setReprovadas(reprovadas);
				dto.setPromedio(promedio);
				
				
				return dto;
			}).collect(Collectors.toList());
			return alumnos;
		}
		
}
