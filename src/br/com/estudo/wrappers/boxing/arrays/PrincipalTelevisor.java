package br.com.estudo.wrappers.boxing.arrays;

public class PrincipalTelevisor {

	public static void main(String[] args) {
		Televisor tv = new Televisor();
	
		//Não deveria mudar o volume e canal
			tv.mudarVolume(20);
			tv.mudarCanal(130);
			
		// Deveria mudar o volume e canal
			tv.mudarVolume(25);
			tv.mudarCanal(13);

	}

}
