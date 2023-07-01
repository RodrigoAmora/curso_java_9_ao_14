package br.com.rodrigoamora.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	// Novidades do Java 10 - Inferência de variável
	public static void main(String[] args) {
		// A palavra var só pode ser usada para definir variáveis locais
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Mario", "04813189");

		System.out.println(cpfPorNomes);
	}
	
}
