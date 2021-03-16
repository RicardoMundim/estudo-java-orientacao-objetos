package br.com.estudo.mais.detalhes.e.frameworks.jdbc;

import java.util.List;

import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.ClienteDAO;
import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.DAOFactory;
import br.com.estudo.mais.detalhes.e.frameworks.jdbc.modelo.Cliente;

public class BuscaTodosClientes {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();

		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		for (Cliente cliente : clientes) {
			System.out.println("---------- Cliente ----------");
			System.out.printf("Código:  %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		} 

	}

}
