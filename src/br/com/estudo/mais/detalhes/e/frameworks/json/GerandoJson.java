package br.com.estudo.mais.detalhes.e.frameworks.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.mysql.cj.xdevapi.Client;

public class GerandoJson {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Saturnino, 140", "Uberlândia", "MG");

		Telefone residencial = new Telefone("RESIDENCIAL", "34 3238-6110");
		Telefone comercial = new Telefone("COMERCIAL", "34 3222-6666");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);
		
		Cliente cliente = new Cliente("João Silva", 28, endereco, telefones);
		
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		Cliente cliente2 = gson.fromJson(json, Cliente.class);
		
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefones().get(0).getNumero());
		

	}

}
