package com.uca.capas.pfnc.controller;

import java.text.ParseException;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.pfnc.domain.Alumno;
import com.uca.capas.pfnc.domain.CentroEscolar;
import com.uca.capas.pfnc.domain.Municipio;
import com.uca.capas.pfnc.dto.AlumnoPromedioDTO;
import com.uca.capas.pfnc.dto.CentroEscolarDTO;
import com.uca.capas.pfnc.service.AlumnoService;
import com.uca.capas.pfnc.service.CentroEscolarService;
import com.uca.capas.pfnc.service.MunicipioService;

@Controller
@RequestMapping("/coordinador")
public class ExpedienteController {

	@Autowired
	AlumnoService alumnoService;
	@Autowired
	CentroEscolarService centroEscolarService;
	@Autowired
	MunicipioService municipioService;

	@RequestMapping(value = "/getAlumno", method = RequestMethod.GET)
	public ModelAndView findOne(@RequestParam(value = "codigo") int id) {

		ModelAndView mav = new ModelAndView();

		Alumno estudiante = new Alumno();

		try {
			estudiante = alumnoService.findOne(id);

		} catch (Exception e) {
			e.printStackTrace();

		}

		mav.addObject("estudiante", estudiante);

		mav.setViewName("alumno");

		return mav;
	}
	
    @RequestMapping("/getExpedientes")
    public ModelAndView buscarClientes(@RequestParam(required = false) String nombre){
        List<AlumnoPromedioDTO> alumnos = alumnoService.findByNombreOrApelPromedio(nombre);

		ModelAndView mav = new ModelAndView();
		mav.addObject("alumnos", alumnos);
		mav.setViewName("listaAlumnos");

		return mav;
    }

	@RequestMapping(value = "/nuevoExpediente", method = RequestMethod.GET)
	public ModelAndView nuevoExpediente() {

		List<CentroEscolar> centros = centroEscolarService.findAll();
		List<Municipio> municipios = municipioService.findAll();
		ModelAndView mav = new ModelAndView();
		Alumno alumno = new Alumno();

		mav.addObject("centros", centros);
		mav.addObject("municipios", municipios);
		mav.addObject("alumno", alumno);

		mav.setViewName("agregarExpediente");

		return mav;
	}
	

	@RequestMapping(value = "/editarExpediente/{id}", method = RequestMethod.GET)
	public ModelAndView editExpediente(@PathVariable("id") int alumnoId) {

		List<CentroEscolar> centros = centroEscolarService.findAll();
		List<Municipio> municipios = municipioService.findAll();
		ModelAndView mav = new ModelAndView();
		Alumno alumno = alumnoService.findOne(alumnoId);

		mav.addObject("centros", centros);
		mav.addObject("municipios", municipios);
		mav.addObject("alumno", alumno);

		mav.setViewName("editarExpediente");

		return mav;
	}

	
	
	@RequestMapping(value = "/nuevoExpediente", method = RequestMethod.POST)
	public ModelAndView nuevoExpedienteSave(@Valid @ModelAttribute Alumno alumno, BindingResult result,
			@RequestParam Integer centroId) {

		ModelAndView mav = new ModelAndView();
		CentroEscolar centroEscolar = centroEscolarService.findOne(centroId);

		if (result.hasErrors()) {
			alumno = new Alumno();

			mav.setViewName("agregarExpediente");

		} else {
			alumno.setCentro_escolar(centroEscolar);
			alumnoService.save(alumno);

			mav.setViewName("index");

		}

		return mav;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView searchExpediente() throws ParseException {
	


		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("buscarExpedientes");

		return mav;
	}

	

	// probando
	@RequestMapping(value = "/getAlumnos", method = RequestMethod.GET)
	public ModelAndView getAlumnos() throws ParseException {
	
		List<Alumno> alumnos = alumnoService.findAll();

		ModelAndView mav = new ModelAndView();
		mav.addObject("alumnos", alumnos);
		mav.setViewName("listaAlumnos");

		return mav;
	}

}
