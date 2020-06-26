package com.uca.capas.pfnc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.service.AlumnoService;
import com.uca.capas.pfnc.service.CentroEscolarService;

@Controller
public class MainController {
	
	

	
	@RequestMapping("/")
	public ModelAndView index() {
		
		
		ModelAndView mav = new ModelAndView();
		
		

		
		mav.setViewName("index");
		

		return mav;
	}
	
	
	
	
	

}
