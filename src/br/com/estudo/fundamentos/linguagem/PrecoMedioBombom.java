package br.com.estudo.fundamentos.linguagem;

public class PrecoMedioBombom {
	
	public static void main(String[] args) {
		//pre�o das �lltimas 3 vendas realizadas
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
		double mediaPreco = (preco1 + preco2 + preco3) / 3.0;
		
		System.out.println("\"Sistema de C�lculo de M�dia\"");
		System.out.println("Pre�o 1: " + preco1);
		System.out.println("Pre�o 2: " + preco2);
		System.out.println("Pre�o 3: " + preco3);
		System.out.println("M�dia dos pre�os: " + mediaPreco);
	}
}