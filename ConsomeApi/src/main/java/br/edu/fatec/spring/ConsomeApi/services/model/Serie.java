package br.edu.fatec.spring.ConsomeApi.services.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Serie(
		//Title, Runtime, Country, Poster
		
		@JsonAlias("Title") String titulo,
		@JsonAlias("Runtime") String duracao,
		@JsonAlias("Country") String pais,
		@JsonAlias("Poster") String poster
		
		) {
	

}
