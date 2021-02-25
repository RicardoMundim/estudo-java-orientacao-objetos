package br.com.estudo.orientacao.objetos.parte2;

public class TesteConstrutor {

	public static void main(String[] args) {
		Pessoa2 pessoa = new Pessoa2("João");
		
		System.out.println("Nome: \"" + pessoa.nome + "\" tem " + pessoa.idade + " anos.");
		
		Pessoa2 pessoa2 = new Pessoa2("Maria", 22);
		
		System.out.println("Nome: \"" + pessoa2.nome + "\" tem " + pessoa2.idade + " anos.");
		
	}

}
