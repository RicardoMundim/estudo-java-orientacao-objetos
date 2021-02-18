package br.com.estudo.orientacao.objetos.parte2.heranca;

public class Jogador extends Pessoa {

	protected boolean aindaJoga = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
}
