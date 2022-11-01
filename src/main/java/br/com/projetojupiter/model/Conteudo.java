package br.com.projetojupiter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_conteudos")
public class Conteudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=5, max =100)
	private String titulo;
	
	@NotNull
	@Size(min=10, max =200)
	private String descricao;
	
	@NotNull
	private String url;
	
	private Long ordemCurso;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getOrdemCurso() {
		return ordemCurso;
	}

	public void setOrdemCurso(Long ordemCurso) {
		this.ordemCurso = ordemCurso;
	}
}
