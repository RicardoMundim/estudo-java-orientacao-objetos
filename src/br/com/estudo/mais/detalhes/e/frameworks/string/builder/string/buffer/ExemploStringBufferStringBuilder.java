package br.com.estudo.mais.detalhes.e.frameworks.string.builder.string.buffer;

public class ExemploStringBufferStringBuilder {

	public static void main(String[] args) {
		//Utilizando em contexto de concorrência - thread-safe - mais lento
		StringBuffer sb = new StringBuffer();
		sb.append("Bem vindo ao curso de java. ");
		sb.append("Fique a vontade para tirar suas duvidas. ");
		sb.append("Estamos aqui para te ajudar. ");

		System.out.println(sb.toString());

		sb.insert(26, " da AlgaWorks");
		
		System.out.println(sb.toString());
		
		//Utilizado em contexto sem concorrência - não thread-safe - mais rápido
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Bem vindo ao curso de java. ");
		sb1.append("Fique a vontade para tirar suas duvidas. ");
		sb1.append("Estamos aqui para te ajudar. ");

		System.out.println(sb1.toString());

		sb1.insert(26, " da AlgaWorks");
		
		System.out.println(sb1.toString());
	}

}
