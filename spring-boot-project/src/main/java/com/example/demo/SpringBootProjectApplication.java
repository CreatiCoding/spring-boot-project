package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootProjectApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String homepage() {
		return "helloworld";
	}

}
