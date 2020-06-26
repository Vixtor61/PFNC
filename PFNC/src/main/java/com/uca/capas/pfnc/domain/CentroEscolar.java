package com.uca.capas.pfnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "public",name = "centro_escolar")
public class CentroEscolar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer centroEscolarId;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipio_id")
	private Municipio municipio;

	


	
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


	public Municipio getMunicipio() {
		return municipio;
	}


	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	
	
	
}
