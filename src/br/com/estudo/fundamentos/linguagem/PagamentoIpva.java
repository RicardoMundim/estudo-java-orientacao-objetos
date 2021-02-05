package br.com.estudo.fundamentos.linguagem;

import java.util.Scanner;

public class PagamentoIpva {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o final da placa: ");
		int finalPlaca = entrada.nextInt();
		
		switch (finalPlaca) {
			case 1:
				System.out.println("Vencimento dia 11 de Janeiro");
				break;
			case 2: 
				System.out.println("Vencimento dia 12 de Janeiro");
				break;
			case 3:
				System.out.println("Vencimento dia 13 de Janeiro");
				break;
			case 4:
				System.out.println("Vencimento dia 14 de Janeiro");
				break;
			case 5:
				System.out.println("Vencimento dia 15 de Janeiro");
				break;
			case 6:
				System.out.println("Vencimento dia 16 de Janeiro");
				break;
			case 7:
				System.out.println("Vencimento dia 17 de Janeiro");
				break;
			case 8:
				System.out.println("Vencimento dia 18 de Janeiro");
				break;
			case 9:
				System.out.println("Vencimento dia 19 de Janeiro");
				break;
			case 0:
				System.out.println("Vencimento dia 20 de Janeiro");
				break;
			default:
				System.out.println("Final informado invalido!!!");
		}

	}

}
