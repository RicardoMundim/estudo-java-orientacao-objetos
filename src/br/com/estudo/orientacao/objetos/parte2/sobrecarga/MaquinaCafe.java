package br.com.estudo.orientacao.objetos.parte2.sobrecarga;

import java.util.Scanner;

public class MaquinaCafe {
	Scanner entrada = new Scanner(System.in);
	
	int acucarDisponivel;
	String decisaoCafe;
	
	void fazerCafe() {
		fazerCafe(10);
	}

	public void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("N�o h� a�ucar suficiente para fazer seu caf�. Gostaria de fazer o caf� sem a�ucar? ");
			decisaoCafe = entrada.next().toUpperCase();
			if(decisaoCafe.equals("S")) {
				System.out.println("Seu caf� est� sendo preparado sem a�ucar.");
			} else {
				System.out.println("Informe o pessoal da manuten��o que a m�quina est� sem a�ucar.");
			}
			
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de a�ucar.");
		}

	}
}
