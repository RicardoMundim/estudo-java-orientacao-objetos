package br.com.estudo.fundamentos.linguagem;

import java.util.Scanner;

public class ExemploBreak {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int divisor = entrada.nextInt();
		
		for (int i = 100; i <= 200; i++) {
			if (i % divisor == 0) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("Fim do programa");
	}

}
