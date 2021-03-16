package br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao;

public class DAOException extends RuntimeException {

	public DAOException(String msg, Throwable t) {
		super(msg, t);
	}
}
