package br.com.projetojupiter.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.projetojupiter.model.Criador;
import br.com.projetojupiter.model.LoginCriador;
import br.com.projetojupiter.repository.CriadorRepository;

@Service
public class CriadorService {
	
	@Autowired
	private CriadorRepository repository;
	
	public Criador cadastrarCriador(Criador criador) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String senhaEncoder = encoder.encode(criador.getSenha());
		criador.setSenha(senhaEncoder);
		return repository.save(criador);
	}
	
	public Optional<LoginCriador> logar(Optional<LoginCriador> loginCriador) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Criador> criador = repository.findByCriador(loginCriador.get().getEmail());
		
		if (criador.isPresent()) {
			if(encoder.matches(loginCriador.get().getSenha(), criador.get().getSenha())) {
				
		String auth = loginCriador.get().getEmail() + ":" + loginCriador.get().getSenha();
		
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		
		String authHeader = "Basic" + new String(encodedAuth);
		
		loginCriador.get().setToken(authHeader);
		
		loginCriador.get().setEmail(criador.get().getEmail());
		
		return loginCriador;
			}
		}
		return null;
	}
}
