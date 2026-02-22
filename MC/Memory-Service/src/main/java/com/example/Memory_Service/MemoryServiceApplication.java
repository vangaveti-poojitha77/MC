package com.example.Memory_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MemoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoryServiceApplication.class, args);
	}
	
	@Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }

}
