package br.com.estudo.mais.detalhes.e.frameworks.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Funcionario> funcionario = new ArrayList<>();
		
		funcionario.add(new Funcionario("João"));
		funcionario.add(new Funcionario("Maria"));
		
//		funcionario.add("Ricardo");
		
		for(Funcionario f : funcionario) {
			System.out.println("Nome do funcionario: " + f.getNome());
		}
		
	}

}
