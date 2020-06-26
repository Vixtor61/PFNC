package com.uca.capas.pfnc.domain;


import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;




@Entity
@Table(schema = "public",name = "alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer alumnoId;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="nombre")
	private String nombre;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="apellido")
	private String apellido;
	
	//@DateTimeFormat(pattern = "dd/MM/yyyy")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_nacimiento",columnDefinition = "DATE")
	private LocalDate fechaNacimiento;
	
	
	@Size(message= "el campo no debe contener mas de 150 caracteres",max = 150)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="direccion")
	private String direccion;
	
	
	@Size(message= "el campo no debe contener mas de 8 caracteres",max = 8,min = 8)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="tel_movil")
	private String telMovil;
	

	@Size(message= "el campo no debe contener mas de 8 caracteres",max = 8,min = 8)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="tel_fijo")
	private String telFijo;
	
	@Size(message= "el campo no debe contener mas de 60 caracteres",max = 60)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="padre")
	private String padre;
	
	@Size(message= "el campo no debe contener mas de 60 caracteres",max = 60)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="madre")
	private String madre;
	
	@Size(message= "el campo debe contener 9 caracteres",max = 9,min = 9)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="carnet")
	private String carnet;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "centro_escolar_id")
	private CentroEscolar centro_escolar;
	
	

	public Alumno() {
		
	}


	


	public Integer getAlumnoId() {
		return alumnoId;
	}





	public void setAlumnoId(Integer alumnoId) {
		this.alumnoId = alumnoId;
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





	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}





	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}





	public String getDireccion() {
		return direccion;
	}





	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}





	public String getTelMovil() {
		return telMovil;
	}





	public void setTelMovil(String telMovil) {
		this.telMovil = telMovil;
	}





	public String getTelFijo() {
		return telFijo;
	}





	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}





	public String getPadre() {
		return padre;
	}





	public void setPadre(String padre) {
		this.padre = padre;
	}





	public String getMadre() {
		return madre;
	}





	public void setMadre(String madre) {
		this.madre = madre;
	}





	public String getCarnet() {
		return carnet;
	}





	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}





	public CentroEscolar getCentro_escolar() {
		return centro_escolar;
	}





	public void setCentro_escolar(CentroEscolar centro_escolar) {
		this.centro_escolar = centro_escolar;
	}





	public  int getEdadDelegate() {
		LocalDate currentDate = LocalDate.now();
        if (this.fechaNacimiento!= null) {
            return Period.between(fechaNacimiento, currentDate).getYears();
        } else {
            return 0;
        }
    }
	
	
}
