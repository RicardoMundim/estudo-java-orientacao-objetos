package br.com.estudo.orientacao.objetos.parte2.contapagar;

import br.com.estudo.orientacao.objetos.parte2.enums.SituacaoConta;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public ContaReceber() {
	}

	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);

	}

	public void receber() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não pode receber uma conta que já está paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não pode receber uma conta que está cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void cancelar() throws OperacaoContaException  {
		if (this.getValor() > 50000d) {
			throw new OperacaoContaException("A conta não pode ser cancelada. Pois possui um valor superior a R$ 50.000,00.");
		} else {
			super.cancelar();
		}
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("\nConta a Receber");
		System.out.println("===================================");
		System.out.println("Fornecedor: " + this.getCliente().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("===================================");
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
}
