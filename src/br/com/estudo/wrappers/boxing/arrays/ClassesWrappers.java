package br.com.estudo.wrappers.boxing.arrays;

public class ClassesWrappers {

	public static void main(String[] args) {
		int x = 10;
		// O Integer é a classe wrapper para int
		Integer i = new Integer(10);
		byte b = i.byteValue();

		// Wrapper é um envelope. As classes wrapper possuem vários metodos para
		// auxiliar no seu manuseio.

		//tipo primitivo	- Classe Wrapper
		//byte				- Byte
		//short				- Short
		//int				- Integer
		//long				- Long
		//float				- Float
		//double			- Double
		//char				- Character
		
		System.out.println(b);
	}

}
