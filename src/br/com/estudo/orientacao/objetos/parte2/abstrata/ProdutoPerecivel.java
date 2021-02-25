package br.com.estudo.orientacao.objetos.parte2.abstrata;

public class ProdutoPerecivel extends Produto {

	String dataValidade;

	@Override
	public void imprimirDescricao() {
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);

	}

}
