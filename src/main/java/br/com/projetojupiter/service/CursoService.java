package br.com.projetojupiter.service;


import br.com.projetojupiter.model.Curso;
import br.com.projetojupiter.model.Pedido;
import br.com.projetojupiter.model.Usuario;
import br.com.projetojupiter.repository.CursoRepository;
import br.com.projetojupiter.repository.PedidoRepository;
import br.com.projetojupiter.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;


    public List<Curso> getAll() {
        return cursoRepository.findAll();
    }
}
