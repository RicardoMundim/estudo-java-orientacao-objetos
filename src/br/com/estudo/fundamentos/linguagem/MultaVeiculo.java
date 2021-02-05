package br.com.estudo.fundamentos.linguagem;

import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipo do veiculo (passeio, caminhão) ");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.println("Veloidade máxima da via");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.println("Velocidade do veículo");
		int velocidadeVeiculo = entrada.nextInt();
		
		if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) ||
				(tipoVeiculo).equals("caminhão") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
			System.out.println("Multa");
		}

	}

}
