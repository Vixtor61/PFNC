package com.uca.capas.pfnc.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "public",name = "municipio")
public class Municipio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer departamento_id;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;


	@OneToMany(mappedBy = "municipio",fetch = FetchType.EAGER)
	private List<CentroEscolar>  centros_escolares;
	
	
	
	
	
	public List<CentroEscolar> getCentros_escolares() {
		return centros_escolares;
	}


	public void setCentros_escolares(List<CentroEscolar> centros_escolares) {
		this.centros_escolares = centros_escolares;
	}


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


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
	
}
