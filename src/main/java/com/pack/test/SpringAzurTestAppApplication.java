package com.pack.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.pack.test")
@RestController
public class SpringAzurTestAppApplication {
	@GetMapping("/message")
	public String messgae()
	{
		return "Welcome to Spring boot with Azur Integration test!...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzurTestAppApplication.class, args);
	}

}
