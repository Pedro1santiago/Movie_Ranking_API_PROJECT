package com.example.apiFilmes;

import com.example.apiFilmes.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiFilmesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiFilmesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.exibirMenu();

	}
}
