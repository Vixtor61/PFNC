package com.uca.capas.pfnc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.service.AlumnoService;

@Controller
public class MainController {
	@Autowired
	AlumnoService alumnoService;
	
	@RequestMapping(value="/getAlumno",method= RequestMethod.GET)
	public ModelAndView  findOne(@RequestParam(value="codigo") int id){

				
				
					
		ModelAndView mav = new ModelAndView();
		
		
		Alumno estudiante = new Alumno();
		
		try {
			 estudiante = alumnoService.findOne(id);
		
		} catch (Exception e) {
			e.printStackTrace();
			/*
			mav.addObject("estudiante",estudiante);
			
			mav.setViewName("estudiante");
			return mav;
		*/

			
			
		}

				mav.addObject("estudiante",estudiante);
				
				mav.setViewName("alumno");
				

		 

		return mav;
	}
	

	
	@RequestMapping("/")
	public ModelAndView index() {
		
		
		ModelAndView mav = new ModelAndView();
		
		

		
		mav.setViewName("index");
		

		return mav;
	}
	
	

}
