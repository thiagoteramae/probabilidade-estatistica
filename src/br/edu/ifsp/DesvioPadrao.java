package br.edu.ifsp;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1700669
 */
public class DesvioPadrao {
	private Double desvioPadrao = 0.;

	public Double getDesvioPadrao() {
		return desvioPadrao;
	}

	public void calculaDesvioPadrao(Double variancia) {
		this.desvioPadrao = Math.sqrt(variancia);
	}
}
