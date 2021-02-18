package br.com.estudo.orientacao.objetos.parte2.modificadorstatic;

public class TesteContador {

	public static void main(String[] args) {
//		Contador.COUNT++;
//
//		int valorDoCount = Contador.count;
//
//		System.out.println("Valor: " + valorDoCount);
//		
		Contador c = new Contador();
		c.incrementar();
		System.out.println(Contador.COUNT);

		Contador.COUNT++;
		System.out.println(c.COUNT);
		
		imprimirContador();
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);
	}

}
