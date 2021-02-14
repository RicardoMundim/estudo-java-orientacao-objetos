package br.com.estudo.orientacao.objetos.parte2;

import br.com.estudo.orientacao.objetos.parte2.enums.Naipe;

public class TesteEnum {

	public static void main(String[] args) {
		Carta quatroPaus = new Carta(4, Naipe.PAUS);
		
		quatroPaus.imprimirCarta();
	}
}
