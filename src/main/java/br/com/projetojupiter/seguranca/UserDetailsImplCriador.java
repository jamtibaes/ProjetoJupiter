package br.com.projetojupiter.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.projetojupiter.model.Criador;


public class UserDetailsImplCriador implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String criadorEmail;
	private String criadorPassword;

	public UserDetailsImplCriador(Criador criad) {
		criadorEmail = criad.getEmail();
		criadorPassword = criad.getSenha();
	}

	public UserDetailsImplCriador() {
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return criadorPassword;
	}

	@Override
	public String getUsername() {
		return criadorEmail;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
