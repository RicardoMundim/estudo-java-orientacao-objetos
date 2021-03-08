package br.com.estudo.topicos.avancados.excecoes;

public class TesteExcecoesChecadas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.sacar(60);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Desculpa saldo insuficiente");
		}
		System.out.println("Saldo: " + cc.getSadldo());

		try {
			cc.sacar(50);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
			System.out.println("Desculpa saldo insuficiente");
		} finally {
			System.out.println("Obrigado por utilizar nosso sistema!");
		}
		
		System.out.println("Saldo: " + cc.getSadldo());

	}

}
