package br.edu.ifsp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import java.util.List;

/**
 *
 * @author a1700669
 */
public class Mediana {
	private Double mediana = 0.;

	public Double getMediana() {
		return mediana;
	}

	public void calculaMediana(List<Double> amostra) {
		List<Double> rol = amostra;
		Collections.sort(rol);

		if (rol.size() % 2 == 0) {
			Double primeiroElemento = rol.get(rol.size() / 2 - 1);
			Double segundoElemento = rol.get(rol.size() / 2);
			this.mediana = (primeiroElemento + segundoElemento) / 2;
		} else {
			mediana = rol.get(rol.size() / 2);
		}

	}
}
