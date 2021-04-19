package br.com.estudo.mais.detalhes.e.frameworks.logging.com.log4j.dao;

import org.apache.log4j.Logger;

import br.com.estudo.mais.detalhes.e.frameworks.logging.com.log4j.model.Cliente;

public class ClienteDAO {

	private static Logger logger = Logger.getLogger(ClienteDAO.class);
	
	public void salvar(Cliente cliente) {
		logger.debug("Salvando o cliente" + cliente);
		//Salvaria o cliente no banco
				
		logger.debug("Cliente salvo com sucesso.");
	}
}
