package com.springbelluu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.javainuse.controllers"})
public class SpringbootHelloworldApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	}
}
