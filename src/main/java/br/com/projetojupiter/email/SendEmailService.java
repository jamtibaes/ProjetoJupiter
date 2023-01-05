package br.com.projetojupiter.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//Classe para o usuario receber o email.
@Service
public class SendEmailService {
	
	@Autowired
	private final JavaMailSender envioEmailDoJava; //Classe que tem toda a configuração para que o email seja enviado
	
	public SendEmailService(final JavaMailSender javaMailSender) {
		this.envioEmailDoJava = javaMailSender;
	}
	
	public void enviar(String para, String titulo, String conteudo) {
		
		var mensagem = new SimpleMailMessage(); //Classe simpleMailMessage gerar os dados de envio do email.
		mensagem.setTo(para);
		mensagem.setSubject(titulo);
		mensagem.setText(conteudo);
		envioEmailDoJava.send(mensagem);
	}

}
