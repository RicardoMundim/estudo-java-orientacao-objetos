package br.com.estudo.orientacao.objetos.parte2.abstrata;

public abstract class Produto {

	String descricao;
	
	public abstract void imprimirDescricao();

	public String getDescricao() {
		return descricao;
	}
	
}
