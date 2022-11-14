package br.com.projetojupiter.email;

import br.com.projetojupiter.model.Usuario;

public class EmailMensagem {
	
	public static String createTitle(Usuario usuario) {
		return usuario.getNome() + "seu cadastro foi recebido!";
	}
	
	public static String messagemToNewUsuario(Usuario usuario) {
		return "Olá" + usuario.getNome()
		+ "Seu cadastro foi realizado com sucesso! \n\n"
		+ "! Seja bem vindo(a) a plataforma Jupiter! \n\n";
		
	}

}
