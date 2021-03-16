package br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.ClienteDAO;
import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private final Connection connection;

	public JdbcDAOFactory() {
		try {
			this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbaprd1", "javaoo",
					"javaoo2021");

		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão com o banco", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
}
