package br.com.bumblebee;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.bumblebee.resource.ModeloResource;

@SpringBootApplication
@EnableAutoConfiguration
public class BumblebeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BumblebeeApplication.class, args);
		ModeloResource modelo = new ModeloResource();
		try {
			modelo.getMarcas();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
