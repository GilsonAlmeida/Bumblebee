package br.com.booblebee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import br.com.booblebee.resource.ModeloResource;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class BooblebeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooblebeeApplication.class, args);
		ModeloResource modelo = new ModeloResource();
		modelo.getMarcas();
	}
}
