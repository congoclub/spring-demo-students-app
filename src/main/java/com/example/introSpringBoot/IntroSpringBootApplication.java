package com.example.introSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IntroSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringBootApplication.class, args);
	}


}
