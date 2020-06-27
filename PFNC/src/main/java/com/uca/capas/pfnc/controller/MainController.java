package com.uca.capas.pfnc.controller;


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
import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.domain.Municipio;
import com.uca.capas.pfnc.service.CuentaService;
import com.uca.capas.pfnc.service.MunicipioService;


@Controller
public class MainController {
	@Autowired
	MunicipioService municipioService;
	@Autowired
	CuentaService cuentaService;
	

	
	@RequestMapping("/")
	public ModelAndView index() {
		
		
		ModelAndView mav = new ModelAndView();
		
		

		
		mav.setViewName("index");
		

		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		
		
		ModelAndView mav = new ModelAndView();
		
		

		
		mav.setViewName("login");
		

		return mav;
	}
	
	
	@RequestMapping("/register")
	public ModelAndView register() {
		
		
		ModelAndView mav = new ModelAndView();

		Cuenta c = new Cuenta();
		mav.addObject("cuenta",c);

		
		mav.setViewName("register");
		

		return mav;
	}
	
	
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public ModelAndView registerSave(@Valid @ModelAttribute Cuenta cuenta, BindingResult result,
			@RequestParam Integer municipioId) {
		
		Municipio m = municipioService.findOne(municipioId);
		cuenta.setMunicipio(m);
		cuentaService.save(cuenta);
		ModelAndView mav = new ModelAndView();

	
		
		mav.setViewName("register");
		

		return mav;
	}
	
	
	
	
	
	

}
