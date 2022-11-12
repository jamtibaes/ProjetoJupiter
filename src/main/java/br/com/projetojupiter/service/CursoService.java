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
import java.util.Date;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Curso> getAll( Long usuario_id ) {

        Usuario usuario = usuarioRepository.findById(usuario_id).get();
        Pedido pedido = pedidoRepository.findByUsuario(usuario);

        LocalDate dataInicial;

        // Descobrir se o usuario é ativo pelo pedido
        Boolean ativo = true;

        if (ativo) {
            return cursoRepository.findAll();
        }

        return null;

    }
}
