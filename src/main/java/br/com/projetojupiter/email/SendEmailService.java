package br.com.projetojupiter.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SendEmailService {
	
	@Autowired
	private final JavaMailSender envioEmailDoJava;
	
	public SendEmailService(final JavaMailSender javaMailSender) {
		this.envioEmailDoJava = javaMailSender;
	}
	
	public void enviar(String para, String titulo, String conteudo) {
		System.out.println("Enviado email para confirmação de cadastro..");
		
		var mensagem = new SimpleMailMessage();
		
		mensagem.setTo(para);
		mensagem.setSubject(titulo);
		mensagem.setText(conteudo);
		envioEmailDoJava.send(mensagem);
		System.out.println("Email enviado com sucesso!");
	}
}
