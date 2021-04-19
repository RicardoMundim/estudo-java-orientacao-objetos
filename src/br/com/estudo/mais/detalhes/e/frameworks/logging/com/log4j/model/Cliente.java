package br.com.estudo.mais.detalhes.e.frameworks.logging.com.log4j.model;

public class Cliente {

	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
}