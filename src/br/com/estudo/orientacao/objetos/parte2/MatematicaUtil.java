package br.com.estudo.orientacao.objetos.parte2;

public class MatematicaUtil {

	public final static double PI = 3.14;
	
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
	
	public static double calcularAreaCirculo(double raio) {
		return (raio * raio) * MatematicaUtil.PI;
	}
			
}
