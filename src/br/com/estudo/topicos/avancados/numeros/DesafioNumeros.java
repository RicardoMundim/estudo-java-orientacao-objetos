package br.com.estudo.topicos.avancados.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class DesafioNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Recebe como parâmetro do usuário o valor de um produto do tipo double.
//		2. Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
//		3. Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
//		4. Formata o novo valor calculado para o padrão monetário (R$).
//		5. Exibe na tela o valor calculado e formatado.
//		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		System.out.print("Digite o valor do prouto: ");
		double valorProduto = entrada.nextDouble();
		
		BigDecimal valorBig = new BigDecimal(valorProduto);
		BigDecimal resultado = valorBig.divide(BigDecimal.TEN);
		
		String valorFormatado = formatador.format(resultado.doubleValue());
		System.out.println("Valor do produto: " + valorProduto);
		System.out.println("10% do valor é: " + valorFormatado);
		System.out.println("O produto com o desconto de 10% é: " + (valorBig.subtract(resultado)));
		
	}

}
