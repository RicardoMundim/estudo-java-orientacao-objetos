package br.com.estudo.orientacao.objetos.parte2.sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		Pessoa pessoa = new Pessoa("Jose", 32);
		
		cadastroPessoa.cadastrar(pessoa);
		
		//----------------------------------
		
		cadastroPessoa.cadastrar("Maria", 25);
	}

}
