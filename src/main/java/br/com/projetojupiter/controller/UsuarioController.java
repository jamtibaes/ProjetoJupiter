package br.com.projetojupiter.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetojupiter.model.Usuario;
import br.com.projetojupiter.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders="*")
public class UsuarioController {
	
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post(Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(usuario));
	}
	
	@PutMapping
	public ResponseEntity<Usuario> put(Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(usuario));
	}

}
