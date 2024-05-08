package br.newtonpaiva.climaTempo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"br.newtonpaiva"})
@EnableMongoRepositories("br.newtonpaiva.climaTempo.repository")
public class ClimaTempoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaTempoApplication.class, args);
	}

}
