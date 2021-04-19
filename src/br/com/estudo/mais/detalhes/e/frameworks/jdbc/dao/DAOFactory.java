package br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao;

import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getDaoFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();

}
