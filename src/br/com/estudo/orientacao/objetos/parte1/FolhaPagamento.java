package br.com.estudo.orientacao.objetos.parte1;

public class FolhaPagamento {
	
	//assinatura do metodo
	//double calcularSalario(int, int, double, double)
	double calcularSalario(int horasNormais, int horasExtras, 
			double valorHoraNormal, double valorHoraExtra) {
		
		double valorHoraNormais = horasNormais * valorHoraNormal;
		double valorHoraExtras = horasExtras * valorHoraExtra;
		
		return valorHoraNormais + valorHoraExtras;
		
	}

}
