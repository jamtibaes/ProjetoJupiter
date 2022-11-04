package br.com.projetojupiter.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetojupiter.model.Criador;
import br.com.projetojupiter.model.LoginCriador;
import br.com.projetojupiter.service.CriadorService;

@RestController
@RequestMapping("/criador")
@CrossOrigin(origins = "*", allowedHeaders="*")
public class CriadorController {
	
	@Autowired
	private CriadorService criadorService;
	
	@PostMapping("/login")
	public ResponseEntity<LoginCriador> authentication(@RequestBody Optional<LoginCriador> loginCriador) {
		return criadorService.login(loginCriador)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED)
						.build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Criador> post(@RequestBody Criador criador) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(criadorService.cadastrarCriador(criador));
	}
}
