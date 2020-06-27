package com.uca.capas.pfnc.domain;

import java.time.LocalDate;

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
@Table(schema = "public", name = "cuenta")
public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer cuentaId;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="nombre")
	private String nombre;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="apellido")
	private String apellido;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_nacimiento",columnDefinition = "DATE")
	private LocalDate fechaNacimiento;
	
	
	@Size(message= "el campo no debe contener mas de 150 caracteres",max = 150)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="direccion")
	private String direccion;
	
	@Column(name = "estado")
	private Boolean estado;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="username")
	private String username;
	

	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="password")
	private String password;
	
	@Column(name = "tipo")
	private String tipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipio_id")
	private Municipio municipio;

	public Integer getCuentaId() {
		return cuentaId;
	}

	public void setCuentaId(Integer cuentaId) {
		this.cuentaId = cuentaId;
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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
	
	
	
	
	
	
	
}
