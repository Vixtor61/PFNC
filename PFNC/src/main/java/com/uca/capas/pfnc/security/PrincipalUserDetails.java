package com.uca.capas.pfnc.security;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.uca.capas.pfnc.domain.Cuenta;

public class PrincipalUserDetails implements UserDetails{
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

}
