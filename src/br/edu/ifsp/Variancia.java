package br.edu.ifsp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1700669
 */
public class Variancia {
	private Double variancia = 0.;

	public Double getVariancia() {
		return variancia;
	}

	public void calculaVariancia(List<Double> amostra, Double media) {
		List<Double> dadosSubtraidosPelaMediaAoQuadrado = new ArrayList<>();
		Double soma = 0.;

		for (Double dado : amostra) {
			Double result = dado - media;
			dadosSubtraidosPelaMediaAoQuadrado.add(Math.pow(result, 2.));
		}

		for (Double dado : dadosSubtraidosPelaMediaAoQuadrado) {
			soma += dado;
		}

		this.variancia = soma / (amostra.size() - 1);
	}
}
