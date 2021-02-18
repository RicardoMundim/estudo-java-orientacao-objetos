package br.com.estudo.orientacao.objetos.parte2.sobreposicao;

public class Produto {

	protected String descricao;
	
	public void identificar() {
		System.out.println("Minha descrição é: " + descricao + ".");
	}
}
