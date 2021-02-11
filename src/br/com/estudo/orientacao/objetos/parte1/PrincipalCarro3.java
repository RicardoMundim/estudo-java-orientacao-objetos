package br.com.estudo.orientacao.objetos.parte1;

public class PrincipalCarro3 {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
	
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
		
	}

}
