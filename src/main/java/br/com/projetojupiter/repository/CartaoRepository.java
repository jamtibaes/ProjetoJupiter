package br.com.projetojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetojupiter.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long>{
	
	

}
