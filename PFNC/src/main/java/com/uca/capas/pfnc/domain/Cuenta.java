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
@Table(schema = "spublic", name = "cuenta")
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
	
	@NotNull(message = "El campo Fecha no puede quedar vacio")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "fecha_nacimiento")
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
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="password")
	private String password;
	
	@Column(name = "tipo")
	private Integer tipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipio_id")
	private Municipio municipio;
	
	
}
