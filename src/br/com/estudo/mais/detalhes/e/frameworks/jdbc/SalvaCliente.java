package br.com.estudo.mais.detalhes.e.frameworks.jdbc;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.ClienteDAO;
import br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao.DAOFactory;
import br.com.estudo.mais.detalhes.e.frameworks.jdbc.modelo.Cliente;

public class SalvaCliente {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());;
		
		Cliente cliente = new Cliente();
		
		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro de cliente", JOptionPane.QUESTION_MESSAGE);
		
		if(nome != null) {
			cliente.setNome(nome);	
		}
		
		
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Cliente salvo com sucesso");

	}

}
