package br.com.estudo.orientacao.objetos.parte1;

public class Carro {

	public String fabricante;
	public String modelo;
	public String cor;
	public int anoDeFabricacao;
	public boolean biCombustivel;
	
	Proprietario proprietario;
		
	void ligar() {
		
		System.out.println("Ligando o carro: " + modelo);
	
	}
}
