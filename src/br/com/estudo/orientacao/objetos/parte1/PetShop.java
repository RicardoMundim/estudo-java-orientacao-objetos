package br.com.estudo.orientacao.objetos.parte1;

public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.nome = "Meg";
		cachorro.raca = "Shitzu";
		cachorro.sexo = 'F';
		cachorro.idade = 8;
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		System.out.println("Idade: " + cachorro.idade);

	}

}
