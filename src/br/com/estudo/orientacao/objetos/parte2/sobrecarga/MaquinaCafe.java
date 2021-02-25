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
			System.out.println("Não há açucar suficiente para fazer seu café. Gostaria de fazer o café sem açucar? ");
			decisaoCafe = entrada.next().toUpperCase();
			if(decisaoCafe.equals("S")) {
				System.out.println("Seu café está sendo preparado sem açucar.");
			} else {
				System.out.println("Informe o pessoal da manutenção que a máquina está sem açucar.");
			}
			
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
		}

	}
}
