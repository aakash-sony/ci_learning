package com.ci.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		System.out.println("main class started");
		System.out.println("changes for 7897 develop branch CI pipeline checking");
		SpringApplication.run(LearningApplication.class, args);
	}

}
