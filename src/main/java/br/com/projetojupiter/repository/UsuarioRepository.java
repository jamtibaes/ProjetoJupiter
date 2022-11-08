package br.com.projetojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetojupiter.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findByEmail(String email);
}
