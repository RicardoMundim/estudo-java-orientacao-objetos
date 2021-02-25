package br.com.estudo.orientacao.objetos.parte2.heranca;

public class Pessoa {

	String nome;
	protected int idade;
	
	public void seApresentar() {
		System.out.println("Olá, eu me chamo " + nome + " e tenho " + idade + " anos");
	}
	
}
