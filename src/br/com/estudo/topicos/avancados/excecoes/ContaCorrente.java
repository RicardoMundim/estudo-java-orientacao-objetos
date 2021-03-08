package br.com.estudo.topicos.avancados.excecoes;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo += saldo;
	}

	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor não pode ser menor ou igual a 0");
		}
		this.saldo += deposito;
	}

	public void sacar(double quantidade) throws SaldoInsuficienteException {
		double saldoTemp = saldo - quantidade;
		if (saldoTemp < 0) {
			throw new SaldoInsuficienteException("Você não possui saldo suficiente");
		}
		this.saldo -= quantidade;
	}

	public double getSadldo() {
		return this.saldo;
	}

}
