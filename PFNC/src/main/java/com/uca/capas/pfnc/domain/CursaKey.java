package com.uca.capas.pfnc.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CursaKey implements Serializable {
	  @Column(name = "alumno_id")
	    private Integer alumnoId;
	  @Column(name = "materia_id")
	    private Integer materiaId;


		public CursaKey() {
			// TODO Auto-generated constructor stub
		}


		

	


		public CursaKey(Integer alumnoId, Integer materiaId) {
			super();
			this.alumnoId = alumnoId;
			this.materiaId = materiaId;
		}







		public Integer getAlumnoId() {
			return alumnoId;
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


		 @Override
		    public int hashCode() {
		        final int prime = 31;
		        int result = 1;
		        result = prime * result + ((alumnoId== null) ? 0 : alumnoId.hashCode());
		        result = prime * result + ((materiaId == null) ? 0 : materiaId.hashCode());
		        return result;
		    }

		    @Override
		    public boolean equals(Object obj) {
		        if (this == obj)
		            return true;
		        if (obj == null)
		            return false;
		        if (getClass() != obj.getClass())
		            return false;
		        CursaKey other = (CursaKey) obj;
		        if (alumnoId == null) {
		            if (other.alumnoId != null)
		                return false;
		        } else if (!alumnoId.equals(other.alumnoId))
		            return false;
		        if (materiaId == null) {
		            if (other.materiaId != null)
		                return false;
		        } else if (!materiaId.equals(other.materiaId))
		            return false;
		        return true;
		    }



/*

		@Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof CursaKey)) return false;
	        CursaKey that = (CursaKey) o;
	        return Objects.equals(getAlumnoId(), that.getAlumnoId()) &&
	                Objects.equals(getMateriaId(), that.getMateriaId());
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash( getAlumnoId(),getMateriaId());
	    }
	
		
*/
	    

}
