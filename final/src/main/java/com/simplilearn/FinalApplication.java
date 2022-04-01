package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class FinalApplication {
	@GetMapping("/")
	public String home() {
		return "Welcome to AWS First Deployment...DEPLOY SPRINGBOOT TO AWS";
	}
	public static void main(String[] args) {
		SpringApplication.run(FinalApplication.class, args);
	}

}
