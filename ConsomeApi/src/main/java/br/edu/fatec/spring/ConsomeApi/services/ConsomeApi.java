package br.edu.fatec.spring.ConsomeApi.services;

import java.io.IOException;
import java.io.Serial;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeApi {
	//CLient, Request , Response.
	public static String obterDado() throws IOException, InterruptedException{
    HttpClient cliente = HttpClient.newHttpClient();
    // Client, Request, Response.
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.omdbapi.com/?t=the+flash&apikey=212353bf"))
            .build();
    HttpResponse<String> response = cliente
    		.send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();
	
	}
}
