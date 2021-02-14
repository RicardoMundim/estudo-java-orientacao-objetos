package br.com.estudo.orientacao.objetos.parte2;

import br.com.estudo.orientacao.objetos.parte2.enums.Naipe;

public class Carta {

	private int numero;
	private Naipe naipe;

	public Carta(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;

	}

	public void imprimirCarta() {
		System.out.println("Sou " + numero + " de " + naipe + ". E tenho a cor " + naipe.getCor());

	}
}
