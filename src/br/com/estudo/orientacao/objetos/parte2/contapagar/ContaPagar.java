package br.com.estudo.orientacao.objetos.parte2.contapagar;

import br.com.estudo.orientacao.objetos.parte2.enums.SituacaoConta;

public class ContaPagar {

	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;

	public ContaPagar() {
		this.situacaoConta = situacaoConta.PENDENTE;
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this();

		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;

	}

	public void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que está cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");

			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void cancelar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + ".");

			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

}
