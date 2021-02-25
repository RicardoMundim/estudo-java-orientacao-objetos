package br.com.estudo.orientacao.objetos.parte2.abstrata;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		p.descricao = "Caixa de leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "10/03/21";

		p.imprimirDescricao();
	}

}
