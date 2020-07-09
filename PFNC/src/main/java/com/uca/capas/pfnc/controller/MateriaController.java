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
import com.uca.capas.pfnc.domain.Cursa;
import com.uca.capas.pfnc.domain.CursaKey;
import com.uca.capas.pfnc.domain.Materia;
import com.uca.capas.pfnc.service.AlumnoService;
import com.uca.capas.pfnc.service.CursaService;
import com.uca.capas.pfnc.service.MateriaService;

@Controller
@RequestMapping("/coordinador")
public class MateriaController {
	@Autowired
	MateriaService materiaService;
	@Autowired
	CursaService cursaService;
	@Autowired
	AlumnoService alumnoService;

	@RequestMapping(value = "/cursa/add/{id}", method = RequestMethod.GET)
	public ModelAndView viewSaveCursa(@PathVariable("id") int id) {

		Alumno alumno = alumnoService.findOne(id);

		String fullName = alumno.getNombre() + " " + alumno.getApellido();
		Integer alumnoId = alumno.getAlumnoId();
		ModelAndView mav = new ModelAndView();
		List<Materia> materias = materiaService.findAll();

		Cursa cursa = new Cursa();

		try {

		} catch (Exception e) {

			e.printStackTrace();

		}

		mav.addObject("fullName", fullName);
		mav.addObject("alumnoId", alumnoId);
		mav.addObject("materias", materias);
		mav.addObject("cursa", cursa);
		mav.setViewName("agregarMateriaAlumno");

		return mav;
	}
	
	
	@RequestMapping(value = "/cursa/edit/", method = RequestMethod.GET)
	public ModelAndView viewSaveCursa(@RequestParam(value = "alumnoId") int alumnoId, @RequestParam(value = "materiaId") int materiaId ) {
		ModelAndView mav = new ModelAndView();
		Cursa cursa = cursaService.findById(alumnoId, materiaId);
		Alumno alumno = alumnoService.findOne(alumnoId);

		String fullName = alumno.getNombre() + " " + alumno.getApellido();

		try {

		} catch (Exception e) {

			e.printStackTrace();

		}

		mav.addObject("fullName", fullName);
		mav.addObject("alumnoId", alumnoId);
		mav.addObject("materiaId", materiaId);
		mav.addObject("cursa", cursa);
		mav.setViewName("editMateriaCursa");

		return mav;
	}
	
	

	@RequestMapping(value = "/cursa/{id}", method = RequestMethod.GET)
	public ModelAndView getMaterias(@PathVariable("id") int id) {

		Alumno alumno = alumnoService.findOne(id);

		String fullName = alumno.getNombre() + " " + alumno.getApellido();
		Integer alumnoId = alumno.getAlumnoId();
		ModelAndView mav = new ModelAndView();

		List<Cursa> cursas = cursaService.findByAlumnoId(id);

		try {

		} catch (Exception e) {

			e.printStackTrace();

		}

		mav.addObject("fullName", fullName);
		mav.addObject("alumnoId", alumnoId);
		mav.addObject("cursas", cursas);
		mav.setViewName("materias");

		return mav;
	}

	@RequestMapping(value = "/cursa", method = RequestMethod.POST)
	public ModelAndView saveCursa(@Valid @ModelAttribute Cursa cursa, BindingResult result,
		@RequestParam(value = "alumnoId") int alumnoId, @RequestParam(value = "materiaId") int materiaId) {

		CursaKey cursaKey = new CursaKey(alumnoId, materiaId);

		ModelAndView mav = new ModelAndView();

		cursa.setId(cursaKey);
		try {
			cursaService.save(cursa);

		} catch (Exception e) {
			e.printStackTrace();

		}

		mav.setViewName("index");

		return mav;
	}

}
