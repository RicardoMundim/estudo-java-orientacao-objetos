package br.com.estudo.orientacao.objetos.parte1;

public class ProdutoComParametroObjeto {
	
	void definirPreco(Preco preco, double precentualImpostos, double margemLucro) {
		preco.valorImpostos = preco.valorCustos * (precentualImpostos / 100);
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
	}
	
}
