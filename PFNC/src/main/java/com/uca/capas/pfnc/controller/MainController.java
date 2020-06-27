package com.uca.capas.pfnc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	

	
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
	
	
	
	
	

}
