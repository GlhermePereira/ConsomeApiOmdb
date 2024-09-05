package br.edu.fatec.spring.ConsomeApi.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDado{
	
	private ObjectMapper mapper = new ObjectMapper();
	@Override
	public <T> T obterDado(String json, Class<T> classe) throws JsonProcessingException{
		
		return mapper.readValue(json, classe);
	}

}
