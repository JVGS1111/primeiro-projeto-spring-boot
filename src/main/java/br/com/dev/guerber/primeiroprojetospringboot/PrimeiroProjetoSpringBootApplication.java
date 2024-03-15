package br.com.dev.guerber.primeiroprojetospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.dev.guerber")
public class PrimeiroProjetoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringBootApplication.class, args);
	}

}
