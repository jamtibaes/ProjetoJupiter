package br.com.projetojupiter.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetojupiter.model.Criador;

@Repository
public interface CriadorRepository extends JpaRepository<Criador, Long> {
	
	public Criador findByEmail(String email);
}
