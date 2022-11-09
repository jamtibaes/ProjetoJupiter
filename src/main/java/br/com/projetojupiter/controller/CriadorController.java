package br.com.projetojupiter.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	private CriadorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Criador>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Criador> post(@RequestBody Criador criador) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(criador));
	}
	
	@PutMapping
	public ResponseEntity<Criador> put(@RequestBody Criador criador) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(criador));
	}
}
