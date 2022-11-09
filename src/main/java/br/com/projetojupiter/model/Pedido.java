package br.com.projetojupiter.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private int periodoContratadoMeses;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicial = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	private double valor;
	
	@ManyToOne
	@JsonIgnoreProperties("pedido")
	private Usuario usuario;
	
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPeriodoContratadoMeses() {
		return periodoContratadoMeses;
	}

	public void setPeriodoContratadoMeses(int periodoContratadoMeses) {
		this.periodoContratadoMeses = periodoContratadoMeses;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
