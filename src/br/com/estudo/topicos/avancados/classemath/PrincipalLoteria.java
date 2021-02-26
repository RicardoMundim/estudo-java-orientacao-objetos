package br.com.estudo.topicos.avancados.classemath;

import java.util.Scanner;

public class PrincipalLoteria {

	public static final int NUMERO_MAXIMO_MEGASENA = 60;
	public static final int NUMERO_MAXIMO_LOTOFACIL = 25;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("/---------------------------------------------/");
		System.out.println("PARA QUAL MODALIDADE DE LOTERIA DESEJA GERAR OS NÚMEROS?");
		System.out.print("Digite 1 para MEGASENA ou 2 para LOTOFACIL: ");
		int tipoLoteria = entrada.nextInt();
		System.out.print("Digite a quantidade de jogos que deseja: ");
		int quantidadeJogos = entrada.nextInt();
		System.out.print("Digite a quantidade de números que deseja gerar: ");
		int quantidadeNumeros = entrada.nextInt();
		
		
		if (tipoLoteria == 1 && (quantidadeNumeros < 6 || quantidadeNumeros > 15)) {
				System.out.println("Quantidade de números informados para a geração dos cartões invalidos. "
						+ "Para a MEGASENA a quantidade deve estar entre 6 e 15.");
		}
			
		if (tipoLoteria == 2 &&  (quantidadeNumeros < 15 || quantidadeNumeros > 18)) {
				System.out.println("Quantidade de números informados para a geração dos cartões invalidos. "
						+ "Para a LOTOFACIL a quantidade deve estar entre 15 e 18.");
		}

		int numeroMaximo;
		
		if (tipoLoteria == 1) {
			numeroMaximo = NUMERO_MAXIMO_MEGASENA;
		} else {
			numeroMaximo = NUMERO_MAXIMO_LOTOFACIL;
		}
		
		Loteria loteria = new Loteria();
		loteria.jogosGerados(quantidadeJogos, quantidadeNumeros, numeroMaximo);
		
		
		System.out.println("*** Boa sorte! ***");
	}
	
}
