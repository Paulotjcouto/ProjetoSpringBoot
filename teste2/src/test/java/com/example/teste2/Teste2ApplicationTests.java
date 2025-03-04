package com.example.teste2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootTest
@RestController
@RequestMapping("/api")
public class Teste2ApplicationTests {

	public static void main(String[] args) {

		SpringApplication.run(Teste2Application.class, args);

	}

	@GetMapping("/hello")
	public String getGreetin() {

		return "Hello World";
	}
	
}
