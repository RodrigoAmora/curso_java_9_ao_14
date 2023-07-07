package br.com.rodrigoamora.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TesteRequisicao {
	// Novidade do Java 11 - HTTP/2 Client API
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder(new URI("https://casadocodigo.com.br"))
											.GET().build();
		HttpResponse<String> httpResponse = httpClient.send(httpRequest, BodyHandlers.ofString());
		
		System.out.println(httpResponse.statusCode());
		System.out.println(httpResponse.version());
	}
}
