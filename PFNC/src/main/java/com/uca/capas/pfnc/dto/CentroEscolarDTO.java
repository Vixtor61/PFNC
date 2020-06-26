package com.uca.capas.pfnc.dto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.uca.capas.pfnc.domain.Municipio;

public class CentroEscolarDTO {
	
	private Integer centroEscolarId;
	

	private String nombre;


	public Integer getCentroEscolarId() {
		return centroEscolarId;
	}


	public void setCentroEscolarId(Integer centroEscolarId) {
		this.centroEscolarId = centroEscolarId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	


}
