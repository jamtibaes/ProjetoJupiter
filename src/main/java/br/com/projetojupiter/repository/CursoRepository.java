package br.com.projetojupiter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetojupiter.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository <Curso, Long> {
	
	public List<Curso> findAllCursoContainingIgnoreCase(String curso);
}
