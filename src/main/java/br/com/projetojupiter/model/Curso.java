package br.com.projetojupiter.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table(name="tb_cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=5, max=100)
	private String curso;
	
	@NotNull
	@Size(min=5, max=100)
	private String titulo;
	
	@NotNull
	@Size(min=10, max=200)
	private String descricao;
	
	@OneToMany(mappedBy="curso", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("curso")
	private List<Conteudo> conteudo;
	
	@ManyToOne
	@JsonIgnoreProperties("curso")
	private Criador criador;
	

	public Criador getCriador() {
		return criador;
	}

	public void setCriador(Criador criador) {
		this.criador = criador;
	}

	public List<Conteudo> getConteudo() {
		return conteudo;
	}

	public void setConteudo(List<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
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
}
