package com.uca.capas.pfnc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CursaKey implements Serializable{
	 	@Column(name = "alumno_id")
	    private Integer alumnoId;

	    @Column(name = "matria_id")
	    private Integer matriaId;

	    
	    
	    


		public Integer getAlumnoId() {
			return alumnoId;
		}






		public void setAlumnoId(Integer alumnoId) {
			this.alumnoId = alumnoId;
		}






		public Integer getMatriaId() {
			return matriaId;
		}






		public void setMatriaId(Integer matriaId) {
			this.matriaId = matriaId;
		}






		public CursaKey() {
			// TODO Auto-generated constructor stub
		}
		
	
		

	    

}
