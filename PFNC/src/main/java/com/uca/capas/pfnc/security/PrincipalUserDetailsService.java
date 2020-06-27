package com.uca.capas.pfnc.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.uca.capas.pfnc.domain.Cuenta;
import com.uca.capas.pfnc.service.CuentaService;

@Service
public class PrincipalUserDetailsService implements UserDetailsService {
	@Autowired
	CuentaService cuentaService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Cuenta> cuenta = cuentaService.findByUsername(username);
		 cuenta.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
		 return cuenta.map(PrincipalUserDetails::new).get();
	}
	
	
	
	

}
