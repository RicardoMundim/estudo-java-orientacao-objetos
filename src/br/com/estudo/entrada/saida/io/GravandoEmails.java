package br.com.estudo.entrada.saida.io;

import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {

	public static void main(String[] args) {
		String[] emails = { "joao@joao.com", "maria@maria.com", "jose@jose.com" };

//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("email.txt"))) {
//			
//			for(String email : emails) {
//				writer.write(email);
//				writer.newLine();
//			}
//		} catch (IOException e) {
//			System.out.println("Não conseguiu gravar o arquivo." + e.getMessage());
//		}

		try (PrintStream writer = new PrintStream("emails2.txt")) {
			for (String email : emails) {
				writer.println(email);
			}
		} catch (IOException e) {
			System.out.println("Não conseguiu gravar o arquivo." + e.getMessage());
		}
	}

}
