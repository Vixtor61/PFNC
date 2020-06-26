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
	private Integer municipioId;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;


	@OneToMany(mappedBy = "municipio",fetch = FetchType.EAGER)
	private List<CentroEscolar>  centrosEscolares;
	
	
	
	
	




	public Integer getMunicipioId() {
		return municipioId;
	}


	public void setMunicipioId(Integer municipioId) {
		this.municipioId = municipioId;
	}


	public List<CentroEscolar> getCentrosEscolares() {
		return centrosEscolares;
	}


	public void setCentrosEscolares(List<CentroEscolar> centrosEscolares) {
		this.centrosEscolares = centrosEscolares;
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
