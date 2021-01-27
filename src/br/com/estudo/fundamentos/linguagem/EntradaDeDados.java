package br.com.estudo.fundamentos.linguagem;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + ": " + imc);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
		} else if (imc < 25) {
			System.out.println("Est� com o peso ideal");
		} else if (imc < 30) {
			System.out.println("Acima do peso ideal");
		} else if (imc < 40) {
			System.out.println("Obesidade grau 1 ou 2");
		} else {
			System.out.println("Obesidade grau 3");
		}
		
	}
}
