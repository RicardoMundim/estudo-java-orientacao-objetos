package br.com.estudo.wrappers.boxing.arrays;

public class Estoque {

	Produto[] produtos;

	void listarProdutos(){
		System.out.println("Produtos em estoque");
		System.out.println("------------------------");
		for(int i = 0; i < produtos.length; i++){
			produtos[i].descrever();
		}
	}

}
