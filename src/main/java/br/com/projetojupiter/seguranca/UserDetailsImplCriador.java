package br.com.projetojupiter.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.projetojupiter.model.Criador;


public class UserDetailsImplCriador implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String CriadorEmail;
	private String CriadorPassword;

	public UserDetailsImplCriador(Criador criad) {
		CriadorEmail = criad.getEmail();
		CriadorPassword = criad.getSenha();
	}

	public UserDetailsImplCriador() {
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return CriadorPassword;
	}

	@Override
	public String getUsername() {
		return CriadorEmail;
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
