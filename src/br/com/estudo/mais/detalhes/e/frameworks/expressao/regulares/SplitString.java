package br.com.estudo.mais.detalhes.e.frameworks.expressao.regulares;

public class SplitString {

	public static void main(String[] args) {
		String texto = "O4Java1é3uma9linguagem19orientada1a7objetos.";
		
		String[] palavras = texto.split("\\d+");
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
