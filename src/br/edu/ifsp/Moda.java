package br.edu.ifsp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author a1700669
 */
public class Moda {

	private List<Double> moda = new ArrayList<>();

	public List<Double> getModa() {
		return moda;
	}

	public void calculaModa(List<Double> amostra) {
		Map<Double, Integer> lista = new HashMap<>();
		Integer maior = 0;

		for (Double dado : amostra) {
			if (lista.containsKey(dado)) {
				Integer qntOcorrenciasNova = lista.get(dado) + 1;
				lista.remove(dado);
				lista.put(dado, qntOcorrenciasNova);
			} else {
				lista.put(dado, 1);
			}
		}

		Set<Entry<Double, Integer>> valoresEOcorrencias = lista.entrySet();

		for (Entry<Double, Integer> elemento : valoresEOcorrencias) {
			if (elemento.getValue() > maior)
				maior = elemento.getValue();
		}

		for (Entry<Double, Integer> elemento : valoresEOcorrencias) {
			if (elemento.getValue() == maior)
				moda.add(elemento.getKey());
		}

	}
}
