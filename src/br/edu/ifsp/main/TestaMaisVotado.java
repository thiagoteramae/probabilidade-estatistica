package br.edu.ifsp.main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.ifsp.MaisVotado;

public class TestaMaisVotado {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(
				new FileInputStream("/Users/thiagoteramae/ifsp-workspace/probabilidade-estatistica/src/candidatos.txt"));

		List<Integer> amostra = new ArrayList<>();

		while (scanner.hasNext()) {
			amostra.add(scanner.nextInt());
		}
		
		MaisVotado maisVotado = new MaisVotado();
		maisVotado.calculaMaisVotado(amostra);
		System.out.println("Mais votado: " + maisVotado.getMaisVotado());
	}
}
