package com.uca.capas.pfnc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.domain.Cursa;
import com.uca.capas.pfnc.domain.CursaKey;
import com.uca.capas.pfnc.domain.Materia;
import com.uca.capas.pfnc.service.AlumnoService;
import com.uca.capas.pfnc.service.CentroEscolarService;
import com.uca.capas.pfnc.service.CursaService;
import com.uca.capas.pfnc.service.MateriaService;

@Controller
@RequestMapping("/admin")
public class CentrosController {
	
	@Autowired
	CentroEscolarService centroService;

	@RequestMapping("/centros")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<CentroEscolar> centros = null;
		
		try {
			centros = centroService.findAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("centros", centros);
		mav.setViewName("centros");
		return mav;
	}

}