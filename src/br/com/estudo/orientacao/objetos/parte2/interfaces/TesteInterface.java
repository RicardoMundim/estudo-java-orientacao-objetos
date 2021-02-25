package br.com.estudo.orientacao.objetos.parte2.interfaces;

public class TesteInterface {

	public static void main(String[] args) {
		Imprimivel i = new NotaFiscal(1234);
		i.imprimir();

		EnviavelPorEmail e = (EnviavelPorEmail) i;
		e.enviar("ricardo@gmail.com");
		
	}

}
