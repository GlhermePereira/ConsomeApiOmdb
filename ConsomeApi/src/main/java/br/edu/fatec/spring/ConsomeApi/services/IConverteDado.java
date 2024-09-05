package br.edu.fatec.spring.ConsomeApi.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;

public interface IConverteDado {
<T> T obterDado(String json, Class<T> classe) throws JsonProcessingException;


}
