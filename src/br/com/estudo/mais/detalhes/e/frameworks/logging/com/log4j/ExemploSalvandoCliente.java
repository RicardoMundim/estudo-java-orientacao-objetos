package br.com.estudo.mais.detalhes.e.frameworks.logging.com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import br.com.estudo.mais.detalhes.e.frameworks.logging.com.log4j.dao.ClienteDAO;
import br.com.estudo.mais.detalhes.e.frameworks.logging.com.log4j.model.Cliente;

public class ExemploSalvandoCliente {

	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		logger.info("Iniciando a aplicação");

		Cliente cliente = new Cliente("João");
		new ClienteDAO().salvar(cliente);

		logger.info("Finalizando a aplicação");

	}

}