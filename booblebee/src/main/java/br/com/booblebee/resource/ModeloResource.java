package br.com.booblebee.resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.booblebee.dto.Marcas;

public class ModeloResource {

	@SuppressWarnings("unchecked")
	public void getMarcas() throws JsonParseException, JsonMappingException, JsonProcessingException, IOException {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<? extends ArrayList<Marcas>> responseEntity = restTemplate.getForEntity(
				"http://fipeapi.appspot.com/api/1/carros/marcas.json",
				(Class<? extends ArrayList<Marcas>>) ArrayList.class);

		ObjectMapper mapper = new ObjectMapper();
		List<Marcas> marcas = mapper.readValue(mapper.writeValueAsString(responseEntity.getBody()),
				new TypeReference<List<Marcas>>() {
				});

	}

}
