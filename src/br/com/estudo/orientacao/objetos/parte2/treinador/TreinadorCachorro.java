package br.com.estudo.orientacao.objetos.parte2.treinador;

import br.com.estudo.orientacao.objetos.parte2.animal.Cachorro;

public class TreinadorCachorro {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
		
	}

}
