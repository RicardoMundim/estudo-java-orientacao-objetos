package br.com.estudo.topicos.avancados.excecoes;

public class TesteExcecoes {

	public static void main(String[] args) {
		//int numero = 5 / 0; // lan�a java.lang.ArithmeticException

		//String s = null;
		//String maiuscula = s.toUpperCase(); // lan�a java.lang.NullPointerException
		
		ContaCorrente cc = new ContaCorrente(100);
		try {
			cc.depositar(-10);
		} catch(IllegalArgumentException e) {
			System.out.println("Voc� executou uma opera��o ilegar: " + e.getMessage());
		}
		
	}

}
