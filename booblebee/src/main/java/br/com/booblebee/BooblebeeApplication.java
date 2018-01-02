package br.com.booblebee;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.booblebee.resource.ModeloResource;

@SpringBootApplication
@EnableAutoConfiguration
public class BooblebeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooblebeeApplication.class, args);
		ModeloResource modelo = new ModeloResource();
		try {
			modelo.getMarcas();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
