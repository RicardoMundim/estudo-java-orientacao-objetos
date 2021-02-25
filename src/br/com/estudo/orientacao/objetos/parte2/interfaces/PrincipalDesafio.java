package br.com.estudo.orientacao.objetos.parte2.interfaces;

public class PrincipalDesafio {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		Carro meuCarro = new Carro(45000d, 2012);
		Barco meuBarco = new Barco(150000d, 2009, "Esperança");
		Imovel minhaCasa = new Imovel(920000, 320);
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuBarco);
	}

}
