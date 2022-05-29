package com.example.FirstAppSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppSpringBootApplication.class, args);
		System.out.println("FirstApp-Building");
	}

}
