package br.com.estudo.orientacao.objetos.parte1;

public class PrincipalCarro {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		Carro seuCarro = new Carro();
		
		meuCarro.fabricante = "GM";
		meuCarro.modelo = "Prisma";
		meuCarro.cor = "Prata";
		meuCarro.anoDeFabricacao = 2015;
		
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.cor = "Preto";
		seuCarro.anoDeFabricacao = 2020;
		
		System.out.println("Meu carro");
		System.out.println();
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano de fabricação: " + meuCarro.anoDeFabricacao);
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.println("Seu carro");
		System.out.println();
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao);

	}

}
