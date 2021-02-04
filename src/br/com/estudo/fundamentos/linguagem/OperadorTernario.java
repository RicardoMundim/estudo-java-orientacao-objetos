package br.com.estudo.fundamentos.linguagem;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();

		String indicacao = (idade >= 18) ? "adulto" : "crian�a/adolescente";
		
		/*N�o � uma boa pr�tica o uso opeeradores ternarios alinhados. Por exemplo:
		 * String indicacao = (idade >= 18) ? "adulto" : (idade <= 12 ? "crian�a" : "adolescente");
    	*/
		System.out.println("Resultado: " + indicacao);
	}
}
