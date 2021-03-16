package br.com.estudo.mais.detalhes.e.frameworks.jdbc;

import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.ClienteDAO;
import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.DAOFactory;
import br.com.estudo.mais.detalhes.e.frameworks.jdbc.modelo.Cliente;

public class BuscaPeloCodigo {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		
		Cliente cliente = clienteDAO.buscarPeloCodigo(1L);
		
		if(cliente != null) {
			System.out.println("---------- Cliente encontrado ----------");
			System.out.printf("Código:  %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		} else {
			System.out.println("Nenhum cliente encontrado.");
		}

	}

}
