package br.edu.ifsp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1700669
 */
public class TestaMediaMedianaModaVarianciaEDesvioPadrao {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(
				new FileInputStream("/Users/thiagoteramae/ifsp-workspace/probabilidade-estatistica/src/amostra.txt"));

		List<Double> amostra = new ArrayList<>();

		while (scanner.hasNext()) {
			String texto = scanner.nextLine();
			String replaced = texto.replace(",", ".");
			Double convertido = Double.parseDouble(replaced);
			amostra.add(convertido);
		}
		
		System.out.println("Amostra: " + amostra);

		Media media = new Media();
		media.calculaMedia(amostra);
		System.out.println("Média: " + media.getMedia());

		Mediana mediana = new Mediana();
		mediana.calculaMediana(amostra);
		System.out.println("Mediana: " + mediana.getMediana());
		
		Variancia variancia = new Variancia();
		variancia.calculaVariancia(amostra, media.getMedia());
		System.out.println("Variância: " + variancia.getVariancia());
		
		DesvioPadrao desvioPadrao = new DesvioPadrao();
		desvioPadrao.calculaDesvioPadrao(variancia.getVariancia());
		System.out.println("Desvio padrão: " + desvioPadrao.getDesvioPadrao());
		
		Moda moda = new Moda();
		moda.calculaModa(amostra);
		System.out.println("Moda: " + moda.getModa());
	}
}
