package br.com.estudo.mais.detalhes.e.frameworks.logging.com.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {

	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		logger.info("Começando a aplicação.");
		//Código da aplicação
		//....
		//....
		
		logger.info("Processo executado");
		
	}

}
