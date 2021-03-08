package br.com.estudo.topicos.avancados.classemath;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TesteClasseMath {

	public static void main(String[] args) {
		// Comprimento de uma circunferência 2 x r x PI
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);

		// Máximo e mínimo
		double[] precoProdutoA = { 30.20, 25.49 };
		System.out.println("Maior preco: " + max(precoProdutoA[0], precoProdutoA[1]));

		System.out.println("Menor preco: " + min(precoProdutoA[0], precoProdutoA[1]));

		// Potência
		System.out.println("Potência de 2 elevado a 3: " + pow(2, 3));

		// Raiz quadrada
		System.out.println("A raiz quadrada de 9: " + sqrt(9));

		// Arredondamento ceil, floor, round
		double n = 5.68;
		System.out.println("Maior inteiro: " + Math.ceil(n));
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Arrendondando: " + Math.round(n));
		
		// Trigonometria
		System.out.println("Seno: " + Math.sin(40));
		System.out.println("Cosseno: " + Math.cos(40));
		System.out.println("Tangente: " + Math.tan(40));
		
		// Números randomicos
		double numeroAleatorio = Math.random();
		System.out.println(numeroAleatorio);
		
	}

}
