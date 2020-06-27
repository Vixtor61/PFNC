package com.uca.capas.pfnc.dto;

public class AlumnoPromedioDTO {
	private Integer alumnoId;
	private String nombre;
	private String apellido;
	private Integer aprovadas;
	private Integer reprovadas;
	private Double promedio;

	public AlumnoPromedioDTO() {

	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Integer getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Integer alumnoId) {
		this.alumnoId = alumnoId;
	}

	public Integer getAprovadas() {
		return aprovadas;
	}

	public void setAprovadas(Integer aprovadas) {
		this.aprovadas = aprovadas;
	}

	public Integer getReprovadas() {
		return reprovadas;
	}

	public void setReprovadas(Integer reprovadas) {
		this.reprovadas = reprovadas;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		promedio = Math.round(promedio * 10) / 10.0;
		this.promedio = promedio;
	}

}
