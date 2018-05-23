package br.edu.ifsp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author a1700669
 */
public class Media {
	private Double media = 0.;

	public Double getMedia() {
		return media;
	}

	public void calculaMedia(List<Double> amostra) {
		Double soma = 0.;
		for (Double dado : amostra) {
			soma += dado;
		}
		media = soma / amostra.size();
	}
}
