package br.com.estudo.mais.detalhes.e.frameworks.generics;

import java.util.List;

public class RetiraElementos {

	public static <T> T recuperaPrimeiro(List<T> lista) {
		return lista.get(0);
	}
}
