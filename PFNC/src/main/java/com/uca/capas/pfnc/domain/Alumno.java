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
	private Integer alumno_id;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="nombre")
	private String nombre;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="apellido")
	private String apellido;
	
	@NotNull(message = "El campo Fecha no puede quedar vacio")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "fecha_nacimiento")
	private LocalDate fecha_nacimiento;
	
	
	@Size(message= "el campo no debe contener mas de 150 caracteres",max = 150)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="direccion")
	private String direccion;
	
	
	@Size(message= "el campo no debe contener mas de 8 caracteres",max = 8,min = 8)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="tel_movil")
	private String tel_movil;
	

	@Size(message= "el campo no debe contener mas de 8 caracteres",max = 8,min = 8)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="tel_fijo")
	private String tel_fijo;
	
	@Size(message= "el campo no debe contener mas de 60 caracteres",max = 60)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="padre")
	private String padre;
	
	@Size(message= "el campo no debe contener mas de 60 caracteres",max = 60)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="madre")
	private String madre;
	
	@Size(message= "el campo no debe contener mas de 60 caracteres",max = 9,min = 9)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="carnet")
	private String carnet;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "centro_escolar_id")
	private CentroEscolar centro_escolar;
	
	

	public Alumno() {
		
	}



	public Integer getAlumno_id() {
		return alumno_id;
	}



	public void setAlumno_id(Integer alumno_id) {
		this.alumno_id = alumno_id;
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



	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTel_movil() {
		return tel_movil;
	}



	public void setTel_movil(String tel_movil) {
		this.tel_movil = tel_movil;
	}



	public String getTel_fijo() {
		return tel_fijo;
	}



	public void setTel_fijo(String tel_fijo) {
		this.tel_fijo = tel_fijo;
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
        if (this.fecha_nacimiento!= null) {
            return Period.between(fecha_nacimiento, currentDate).getYears();
        } else {
            return 0;
        }
    }
	
	
}
