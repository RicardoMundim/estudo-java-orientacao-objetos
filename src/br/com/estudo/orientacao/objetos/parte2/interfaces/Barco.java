package br.com.estudo.orientacao.objetos.parte2.interfaces;

public class Barco implements Seguravel {

	private double valorMercado;
	private int anoFabricacao;
	private String nome;

	public Barco(double valorMercado, int anoFabricacao, String nome) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
		this.nome = nome;
	}

	public String obterDescricao() {
		return "Barco " + this.nome + " fabricado em " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}

	public double calcularValorApolice() {
		// cálculos fictícios do valor de uma apólice de um barco
		double valorApolice = this.valorMercado * 0.05;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.95;
		} else if(anoFabricacao < 2010) {
			valorApolice = valorApolice * 0.85;
		}
		return valorApolice;
	}

}
