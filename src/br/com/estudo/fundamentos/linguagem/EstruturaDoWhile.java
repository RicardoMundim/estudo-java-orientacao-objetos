package br.com.estudo.fundamentos.linguagem;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		int soma = 0;
		
		do {
			System.out.print("Digite 0 para sair ou qualquer n�mero para somar: ");
			valor = entrada.nextInt();
			
			soma += valor;
			System.out.println("Soma: " + soma);
				
		} while (valor != 0);
	}
}
