package br.com.estudo.wrappers.boxing.arrays;

class Televisor {
	Integer canal = 130;
	Integer volume = 20;

	void mudarCanal(Integer novoCanal) {
		//Alterado (canal == novoCanal) para (canal.equals(novoCanal))
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}

	void mudarVolume(Integer novoVolume) {
		//Alterado (novoVolume == volume) para  (novoVolume.equals(volume)) 
		if (novoVolume.equals(volume)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			//Alterado volume = new Integer(novoVolume.byteValue()); para volume = novoVolume;
			volume = novoVolume;
			System.out.println("Volume alterado para " + volume);
		}
	}

}
