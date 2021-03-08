package br.com.estudo.topicos.avancados.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa uma organiza��o que possui um conjunto de pol�ticos
 * que governam um estado, munic�pio, etc.
 * 
 * @author Ricardo Mundim
 *
 */

public class Governo {

	/**
	 * Mapa com uma lista de pol�ticos por estado da federac�o.
	 * A chave do mapa faz refer�ncia � sigla do partido e
	 * o valor � uma lista de pol�ticos do partido.
	 */
	private Map<String, List<Politico>> partidosPoliticos;

	/**
	 * Construtor do governo.
	 * Instancia um mapa vazio de pol�ticos.
	 */
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	/**
	 * Adiciona um pol�tico � rela��o de pol�ticos.
	 * 
	 * @param partidoPolitico sigla do partido pol�tico
	 * @param politico pol�tico a ser adicionado para o partido
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de pol�ticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		// se n�o existir uma lista de pol�ticos para o partido informado,
		// devemos instanciar uma nova lista (pois � a primeira inclus�o neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		// adiciona o pol�tico recebido como par�metro � lista de pol�ticos
		politicos.add(politico);
		// adiciona a lista de pol�ticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	/**
	 * Consulta e calcula os gastos com sal�rios de todos os pol�ticos
	 * do partido informado.
	 * O valor retornado � em Reais.
	 * 
	 * @param partidoPolitico sigla do partido pol�tico a ser filtrado na consulta
	 * @return valor de gastos com sal�rios, em reais
	 */
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		if (politicos != null) {
			for (Politico politico : politicos) {
				total = total.add(politico.getCargo().getSalario());
			}
		}

		return total;
	}

	/**
	 * Consulta e calcula os gastos com sal�rios de todos os pol�ticos
	 * do cargo e partido pol�tico informados.
	 * O valor retornado � em Reais.
	 * 
	 * @param cargo cargo dos pol�ticos a ser filtrado na consulta
	 * @param partidoPolitico sigla do partido pol�tico a ser filtrado na consulta
	 * @return valor de gastos com sal�rios, em reais
	 */
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		if (politicos != null) {
			for (Politico politico : politicos) {
				// verifica se cargo do pol�tico � igual ao cargo informado no par�metro
				if (politico.getCargo().equals(cargo)) {
					total = total.add(politico.getCargo().getSalario());
				}
			}
		}

		return total;
	}
}
