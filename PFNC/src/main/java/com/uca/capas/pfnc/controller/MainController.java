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
import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.domain.Departamento;
import com.uca.capas.pfnc.domain.Municipio;
import com.uca.capas.pfnc.service.CuentaService;
import com.uca.capas.pfnc.service.DepartamentoService;
import com.uca.capas.pfnc.service.MunicipioService;



@Controller
public class MainController {
	@Autowired
	MunicipioService municipioService;
	@Autowired
	DepartamentoService departamentoService;
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
		List<Departamento> departamentos  = departamentoService.findAll();
		Cuenta c = new Cuenta();
		mav.addObject("departamentos",departamentos);
		mav.addObject("cuenta",c);

		
		mav.setViewName("register");
		

		return mav;
	}
	
	
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public ModelAndView registerSave(@Valid @ModelAttribute Cuenta cuenta, BindingResult result,
			@RequestParam Integer municipioId) {
		
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			
			
			List<Departamento> departamentos  = departamentoService.findAll();
			
			
			mav.addObject("departamentos",departamentos);
		
			
			mav.setViewName("register");
			
		}else {
			Municipio m = municipioService.findOne(municipioId);
			cuenta.setMunicipio(m);
			cuenta.setEstado(true);
			cuenta.setTipo("ROLE_USER");
			cuentaService.save(cuenta);
			 mav = new ModelAndView("redirect:/");
			
		}
		
		
		
		

		return mav;
	}
	
	
	
	
	
	

}
