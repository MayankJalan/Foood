package com.example.Foood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.example.Foood.repo")
@SpringBootApplication
public class FooodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooodApplication.class, args);
	}

}
