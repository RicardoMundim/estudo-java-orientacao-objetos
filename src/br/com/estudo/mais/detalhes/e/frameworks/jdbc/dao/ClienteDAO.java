package br.com.estudo.mais.detalhes.e.frameworks.jdbc.dao;

import java.util.List;

import br.com.estudo.mais.detalhes.e.frameworks.jdbc.modelo.Cliente;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();
}
