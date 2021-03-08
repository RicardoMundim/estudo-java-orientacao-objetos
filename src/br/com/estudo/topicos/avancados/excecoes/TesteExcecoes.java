package br.com.estudo.topicos.avancados.excecoes;

public class TesteExcecoes {

	public static void main(String[] args) {
		//int numero = 5 / 0; // lança java.lang.ArithmeticException

		//String s = null;
		//String maiuscula = s.toUpperCase(); // lança java.lang.NullPointerException
		
		ContaCorrente cc = new ContaCorrente(100);
		try {
			cc.depositar(-10);
		} catch(IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegar: " + e.getMessage());
		}
		
	}

}
