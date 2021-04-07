package br.com.estudo.mais.detalhes.e.frameworks.arquivo.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config/config.properties"));
		
		//Conectando no banco de dados....
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");
		
		System.out.printf("Conectando no banco de dados de url: %s e usu�rio: %s\n", url, usuario);
		
		try {
			int x = 5 / 0;
		} catch (Exception e) {
			//Se acontecer algum erro, voc� precisa informar o administrador por e-mail
			String email = prop.getProperty("email.admin");
			System.err.printf("Enviando email para: %s informando o erro: %s", email, e.getMessage());
		}

	}

}
