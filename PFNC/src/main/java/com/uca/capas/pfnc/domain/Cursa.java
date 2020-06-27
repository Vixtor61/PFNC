package com.uca.capas.pfnc.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cursa")
public class Cursa {
	
	   @EmbeddedId
	    private CursaKey id;
	 
	    @ManyToOne
	    @MapsId("alumno_id")
	    @JoinColumn(name = "alumno_id")
	    private Alumno alumno;

	    @ManyToOne
	    @MapsId("materia_id")
	    @JoinColumn(name = "materia_id")
	    private Materia materia;
	    
	    @NotNull
	    @Column(name = "nota")
	    private Double nota;
	    
	    @NotNull
	    @Column(name = "annio")
	    private int annio;
	    
	    @NotNull
	    @Column(name = "ciclo")
	    private int ciclo;

		public CursaKey getId() {
			return id;
		}

		public void setId(CursaKey id) {
			this.id = id;
		}

		public Alumno getAlumno() {
			return alumno;
		}

		public void setAlumno(Alumno alumno) {
			this.alumno = alumno;
		}

		

		public Materia getMateria() {
			return materia;
		}

		public void setMateria(Materia materia) {
			this.materia = materia;
		}

		public Double getNota() {
			return nota;
		}

		public void setNota(Double nota) {
			this.nota = nota;
		}

		public int getAnnio() {
			return annio;
		}

		public void setAnnio(int annio) {
			this.annio = annio;
		}

		public int getCiclo() {
			return ciclo;
		}

		public void setCiclo(int ciclo) {
			this.ciclo = ciclo;
		}


	    
	    
	    
	    
	    
	    
	    
	    
}
