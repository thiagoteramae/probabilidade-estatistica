package br.edu.ifsp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaisVotado {
	private Integer maisVotado = 0;
	private Integer qtn = 0;

	public void calculaMaisVotado(List<Integer> amostra) {
		Map<Integer, Integer> ocorrencias = new HashMap<Integer, Integer>();

		for (Integer candidato : amostra) {
			if (ocorrencias.containsKey(candidato)) {
				Integer novaOcorrencia = ocorrencias.get(candidato) + 1;
				ocorrencias.remove(candidato);
				ocorrencias.put(candidato, novaOcorrencia);
			} else {
				ocorrencias.put(candidato, 1);
			}
		}

		Set<Entry<Integer, Integer>> ocorrenciasIteraveis = ocorrencias.entrySet();

		for (Entry<Integer, Integer> candidato : ocorrenciasIteraveis) {
			if (candidato.getValue() > this.qtn) {
				this.qtn = candidato.getValue();
				this.maisVotado = candidato.getKey();
			}
		}
	}

	public Integer getMaisVotado() {
		return maisVotado;
	}
}
