package br.com.estudo.topicos.avancados.classemath;

public class Loteria {

	private int[] numerosSorteados;
	
	public void sortear(int quantidadeNumeros, int numeroMaximo) {
		this.numerosSorteados = new int[quantidadeNumeros];
		
		for (int i = 1; i <= quantidadeNumeros; i++) {
			// gera n�mero aleat�rio, arredonda e converte para inteiro
			int numeroSorteado = (int) Math.round(Math.random() * numeroMaximo);
			
			// verifica se n�mero ainda n�o foi sorteado e n�o � 0
			if (!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0) {
				// adiciona o n�mero sorteado no array de n�meros sorteados
				this.numerosSorteados[i-1] = numeroSorteado;
			} else {
				// decrementa i para refazer o sorteio da mesma posi��o
				i--;
			}
		}
	}
	
	public void exibirNumeros() {
		for (int numeroSorteado : numerosSorteados) {
			System.out.print(numeroSorteado + " ");
		}
		// quebra de linha
		System.out.println();
	}
	
	private boolean jaFoiSorteado(int numero) {
		boolean resultado = false;
		for (int i = 0; i < this.numerosSorteados.length; i++) {
			if (this.numerosSorteados[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	public void jogosGerados(int quantidadeJogos, int quantidadeNumeros, int numeroMaximo) {
		for (int i = 1; i <= quantidadeJogos; i++) {
			this.sortear(quantidadeNumeros,numeroMaximo);
			System.out.println("----------------------------");
			this.exibirNumeros();
			System.out.println("----------------------------");
		}	
		
	}
	
}
