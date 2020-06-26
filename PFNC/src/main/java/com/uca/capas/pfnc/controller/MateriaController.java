package com.uca.capas.pfnc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.domain.Cursa;
import com.uca.capas.pfnc.domain.Materia;
import com.uca.capas.pfnc.service.AlumnoService;
import com.uca.capas.pfnc.service.CursaService;
import com.uca.capas.pfnc.service.MateriaService;

@Controller
public class MateriaController {
	@Autowired
	MateriaService materiaService;
	@Autowired
	CursaService cursaService;
	@Autowired
	AlumnoService alumnoService;
	
	
	
	@RequestMapping(value="/cursa",method= RequestMethod.GET)
	public ModelAndView  viewSaveCursa(@RequestParam(value="codigo") int id){

				
				
		Alumno alumno = alumnoService.findOne(id);
		
		String fullName = alumno.getNombre()+ " "+ alumno.getApellido() ;
		Integer alumnoId = alumno.getAlumnoId();
		ModelAndView mav = new ModelAndView();
		List<Materia> materias = materiaService.findAll();
		
		
		Cursa cursa = new Cursa();
		
		try {
		
		} catch (Exception e) {
			
			e.printStackTrace();
				
		}
		
		mav.addObject("fullName",fullName);
		mav.addObject("alumnoId",alumnoId);		
		mav.addObject("materias",materias);
		mav.addObject("cursa",cursa);		
		mav.setViewName("agregarMateriaAlumno");

		return mav;
	}
	
	@RequestMapping(value="/cursa",method= RequestMethod.POST)
	public ModelAndView  SaveCursa(@RequestParam(value="codigo") int id){

				
				
					
		ModelAndView mav = new ModelAndView();
		List<Materia> materias = materiaService.findAll();
	
		
		Cursa cursa = new Cursa();
		
		try {
		
		
		} catch (Exception e) {
			e.printStackTrace();
			
		

			
			
		}
				mav.addObject("materias",materias);
				mav.addObject("cursa",cursa);
				
				mav.setViewName("agregarMateriaAlumno");
				

		 

		return mav;
	}
	
	
}
