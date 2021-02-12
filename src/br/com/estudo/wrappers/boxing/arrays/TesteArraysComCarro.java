package br.com.estudo.wrappers.boxing.arrays;

import br.com.estudo.orientacao.objetos.parte1.Carro;

public class TesteArraysComCarro {

	public static void main(String[] args) {
		Carro[] carros = new Carro[3];
		
		for (int i = 0; i < carros.length; i++) {
			carros[i] = new Carro();
		}
		
		carros[0].anoDeFabricacao = 2011;
		carros[1].anoDeFabricacao = 2012;
		
		for(int i = 0; i < carros.length; i++) {
			if (carros[i].anoDeFabricacao != 0 ) {
				System.out.println("Temos carros dos anos: " + carros[i].anoDeFabricacao);	
			}
		}

	}
}
