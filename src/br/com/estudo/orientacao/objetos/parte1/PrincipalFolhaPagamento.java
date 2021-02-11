package br.com.estudo.orientacao.objetos.parte1;

public class PrincipalFolhaPagamento {

	public static void main(String[] args) {
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		double salario = folhaPagamento.calcularSalario(160, 12, 32.5, 40.2);
		
		System.out.println("Salário calculado: " + salario);

	}

}
