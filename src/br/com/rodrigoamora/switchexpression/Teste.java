package br.com.rodrigoamora.switchexpression;

public class Teste {
	// Novidade do Java 14 - Switch Expression
	public static void main(String[] args) {
		String nome = "João";
		switch(nome) {
			case "João" -> System.out.println("Acertou: "+nome);
			case "Renata" -> System.out.println("Acertou: "+nome);
			case "Rodrigo" -> System.out.println("Acertou: "+nome);
			default -> System.out.println("Nenhum nome encontrado!");
		}
	}
}
