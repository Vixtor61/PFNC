package com.uca.capas.pfnc.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(schema = "public",name = "departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer departamento_id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "departamento_id",fetch = FetchType.EAGER)
	private List<Municipio>  municipios;

	public Integer getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(Integer departamento_id) {
		this.departamento_id = departamento_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}
	
	
	
	
	

}
