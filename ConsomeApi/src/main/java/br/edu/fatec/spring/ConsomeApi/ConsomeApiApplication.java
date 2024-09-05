package br.edu.fatec.spring.ConsomeApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

import br.edu.fatec.spring.ConsomeApi.services.ConsomeApi;
import br.edu.fatec.spring.ConsomeApi.services.ConverteDados;
import br.edu.fatec.spring.ConsomeApi.services.model.Serie;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ConsomeApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConsomeApiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Ola mundo");
	String json = ConsomeApi.obterDado();
	System.out.println(json);
	ConverteDados conversor = new ConverteDados();
	Serie serie = conversor.obterDado(json, Serie.class);
	System.out.println(serie);

	}
}
