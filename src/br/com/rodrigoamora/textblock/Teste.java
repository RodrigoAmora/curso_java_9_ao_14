package br.com.rodrigoamora.textblock;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {
	//Novidades do Java 9
	public static void main(String[] args) {
		List<String> nomes = List.of("primeiroNome", "segundoNome");
		System.out.println(nomes);
		
		Set.of("terceiroNome");
		Map.of("nome", "João");
		
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		 */
	}
}
