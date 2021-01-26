package br.com.estudo.fundamentos.linguagem;

public class CalculadoraAreaValoresFixos {
	
	public static void main (String[] args) {
		// indica se detalhamento do calculo deve ser apresentado na tela
		boolean calculoDetalhado = true;
		
		// constante do PI
		double pi = 3.14d;
		
		// raio - informado pelo professor
		double raio = 5.3d;
		
		// cálculo da área é igual ao raio ao quadrado multiplicador por PI
		double area = raio * raio * pi;
		int areaSemCasasDecimais = (int) area;
		
		if(calculoDetalhado) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}
		
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
	}
}