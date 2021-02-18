package br.com.estudo.orientacao.objetos.parte2.heranca;

public class TesteHeranca {
	
	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		jogador.nome = "Gabriel";
		jogador.idade = 3;
		
		jogador.seApresentar();
		jogador.dizerSeAindaJoga();
	}

}
