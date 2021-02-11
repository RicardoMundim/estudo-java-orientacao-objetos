package br.com.estudo.orientacao.objetos.parte1;

public class PrincipalPrecoCusto {

	public static void main(String[] args) {
		double preco = 140;
		
		Produto produto = new Produto();
		preco = produto.definirPreco(preco);
		
		System.out.println("Preço: " + preco);

	}

}
