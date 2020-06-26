package com.uca.capas.pfnc.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

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
	    private Materia course;

	    @Column(name = "nota")
	    private int nota;

	    @Column(name = "annio")
	    private int annio;

	    @Column(name = "ciclo")
	    private int ciclo;

		public Alumno getAlumno() {
			return alumno;
		}

		public void setAlumno(Alumno alumno) {
			this.alumno = alumno;
		}

		public Materia getCourse() {
			return course;
		}

		public void setCourse(Materia course) {
			this.course = course;
		}

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
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
