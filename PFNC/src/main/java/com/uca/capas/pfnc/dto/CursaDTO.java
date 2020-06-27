package com.uca.capas.pfnc.dto;

public class CursaDTO {
	private Integer alumnoId;
	private Integer materiaId;
	private String materia;
	private Integer annio;
	private String ciclo;
	private Double nota;
	private String Resultado;

	public Integer getAlumnoId() {
		return alumnoId;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void setAlumnoId(Integer alumnoId) {
		this.alumnoId = alumnoId;
	}

	public Integer getMateriaId() {
		return materiaId;
	}

	public void setMateriaId(Integer materiaId) {
		this.materiaId = materiaId;
	}

	public Integer getAnnio() {
		return annio;
	}

	public void setAnnio(Integer annio) {
		this.annio = annio;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getResultado() {
		return Resultado;
	}

	public void setResultado(String resultado) {
		Resultado = resultado;
	}

}
