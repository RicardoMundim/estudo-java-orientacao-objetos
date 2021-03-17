package br.com.estudo.mais.detalhes.e.frameworks.varargs;

public class CorreioEletronico {
	
	public void enviarEmails(String... emails) {
		
		// Pecorrer todos os e-mails recebidos
		for(String email : emails) {
			// envia e-mail
			System.out.println("E-mail enviado para: " + email);
		}
	}

}
