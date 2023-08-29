package br.com.leonardozw.filmsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // Enables Feign Clients
@SpringBootApplication
public class FilmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmsApiApplication.class, args);
	}

}
