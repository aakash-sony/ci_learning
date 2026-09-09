package com.ci.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		System.out.println("main class started");
		SpringApplication.run(LearningApplication.class, args);
	}

}
