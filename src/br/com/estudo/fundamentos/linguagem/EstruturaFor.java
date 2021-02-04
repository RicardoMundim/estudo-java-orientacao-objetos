package br.com.estudo.fundamentos.linguagem;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		int numeroInicial = entrada.nextInt();
		
		System.out.print("Ultimo número: ");
		int numeroFinal = entrada.nextInt();
		
		if (numeroInicial < numeroFinal) {
			for(int i = numeroInicial; i <= numeroFinal; i++ ) {
				System.out.println(i);
			}
		} else {
			for(int i = numeroInicial; i >= numeroFinal; i-- ) {
				System.out.println(i);
			}
		}
	}
}
