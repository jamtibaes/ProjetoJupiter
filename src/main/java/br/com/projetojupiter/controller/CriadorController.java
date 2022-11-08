package br.com.projetojupiter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetojupiter.model.Criador;
import br.com.projetojupiter.repository.CriadorRepository;

@RestController
@RequestMapping("/criador")
@CrossOrigin(origins = "*", allowedHeaders="*")
public class CriadorController {
	
	@Autowired
	private CriadorRepository repository;;
	
	@PostMapping
	public ResponseEntity<Criador> post(@RequestBody Criador criador) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(criador));
	}
}
