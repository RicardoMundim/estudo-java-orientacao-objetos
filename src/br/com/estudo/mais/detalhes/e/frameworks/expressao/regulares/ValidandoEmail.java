package br.com.estudo.mais.detalhes.e.frameworks.expressao.regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmail {

	public static void main(String[] args) {
		String[] emails = {"joao@joao.com", "maria@", "jose@jose", "ricardo@ricardo.com.br"};
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " é um e-mail válido.");
			}
		}
	}

}
