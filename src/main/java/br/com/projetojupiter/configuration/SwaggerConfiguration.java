package br.com.projetojupiter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	public OpenAPI springProjetoJupiterOpenAPI() {
		return new OpenAPI()
				.info(new Info()
					.title("Projeto Jupiter")
					.description("Plataforma de cursos online")
					.version("v0.0.1")
				.license(new License()
					.name("Digital House")
					.url("https://www.digitalhouse.com/br"))
				.contact(new Contact()
					.name("Send email - Grupo Projeto Jupiter")
					.email("jupiterprojeto2@gmail.com")))
				.externalDocs(new ExternalDocumentation()
					.description("Github")
					.url("https://github.com/DanieleStein"));
	}
}
