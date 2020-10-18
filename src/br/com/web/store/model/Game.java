package br.com.web.store.model;

import br.com.web.store.enums.EnumClassificacao;
import br.com.web.store.enums.EnumMidia;
import br.com.web.store.enums.EnumTipo;

public class Game extends Produto {

	private EnumTipo tipo;
	
	private EnumClassificacao classificacao;
	
	private EnumMidia midia;
	
	private Integer numeroJogadores;
	
	private Boolean conectividade;
	
	private Plataforma plataforma;

	public EnumTipo getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipo tipo) {
		this.tipo = tipo;
	}

	public EnumClassificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(EnumClassificacao classificacao) {
		this.classificacao = classificacao;
	}

	public EnumMidia getMidia() {
		return midia;
	}

	public void setMidia(EnumMidia midia) {
		this.midia = midia;
	}

	public Integer getNumeroJogadores() {
		return numeroJogadores;
	}

	public void setNumeroJogadores(Integer numeroJogadores) {
		this.numeroJogadores = numeroJogadores;
	}

	public Boolean getConectividade() {
		return conectividade;
	}

	public void setConectividade(Boolean conectividade) {
		this.conectividade = conectividade;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	
	
}
