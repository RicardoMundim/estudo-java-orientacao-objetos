package br.com.estudo.orientacao.objetos.parte2.animal;

public class Cachorro {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void sentar() {
		System.out.println("O cachorro, " + nome + " esta aprendendo a sentar.");
	}
}
