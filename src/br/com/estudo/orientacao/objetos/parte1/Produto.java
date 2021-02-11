package br.com.estudo.orientacao.objetos.parte1;

public class Produto {
	
	double definirPreco(double precoCusto) {
		//Adiciona 20% ao preço de custo
		precoCusto = precoCusto * 1.20; 
			
		return precoCusto;
	}
	
}
