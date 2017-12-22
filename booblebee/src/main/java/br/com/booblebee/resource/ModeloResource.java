package br.com.booblebee.resource;

import org.springframework.web.client.RestTemplate;


public class ModeloResource {

	public void getMarcas() {
	 RestTemplate restTemplate = new RestTemplate();
     String marcas = restTemplate.getForObject("http://fipeapi.appspot.com/api/1/carros/marcas.json", String.class);
     System.out.println(marcas);
	}
   
}
