package com.uca.capas.pfnc.security;
import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.domain.CursaKey;

public class PrincipalUserDetails implements UserDetails,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cuenta user;
	
	public PrincipalUserDetails (Cuenta user){
        this.user = user;
        
    }

	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
	      List<GrantedAuthority> authorities = new ArrayList<>();
	      GrantedAuthority authority = new SimpleGrantedAuthority(this.user.getTipo());
	      authorities.add(authority);


	        return authorities;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.user.getPassword();
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.user.getUsername();
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return this.user.getEstado();
	}

	
	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((getUsername()== null) ? 0 : getUsername().hashCode());
	      
	        return result;
	    }
/*
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Cuenta other = (Cuenta) obj;
	        if (getUsername() == null) {
	            if (other.getUsername() != null)
	                return false;
	        } else if (!getUsername().equals(other.getUsername()))
	            return false;
	        
	        return true;
	    }
*/

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrincipalUserDetails)) return false;
        PrincipalUserDetails that = (PrincipalUserDetails) o;
        return Objects.equals(this.user.getUsername(), that.getUsername());
    }
 /*
    @Override
    public int hashCode() {
        return Objects.hash( this.user.getUsername());
    }
*/

}
