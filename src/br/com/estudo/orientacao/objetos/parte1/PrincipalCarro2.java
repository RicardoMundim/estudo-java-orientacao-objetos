package br.com.estudo.orientacao.objetos.parte1;

public class PrincipalCarro2 {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.proprietario = new Proprietario();
		
		meuCarro.proprietario.nome = "Maria da Silva";
		meuCarro.proprietario.cpf = "111.111.111-00";
		meuCarro.proprietario.idade = 30;
		meuCarro.proprietario.logradouro = "Rua João Pinheiro, 10";
		meuCarro.proprietario.bairro = "Centro";
		meuCarro.proprietario.cidade = "Uberlândia";
		
		System.out.println(meuCarro.anoDeFabricacao);
		System.out.println(meuCarro.cor);
		System.out.println(meuCarro.fabricante);
		System.out.println(meuCarro.modelo);
		System.out.println(meuCarro.proprietario.nome);
		System.out.println(meuCarro.proprietario.cpf);
		System.out.println(meuCarro.proprietario.idade);
		System.out.println(meuCarro.proprietario.logradouro);
		System.out.println(meuCarro.proprietario.bairro);
		System.out.println(meuCarro.proprietario.cidade);
	}

}
