package com.rbc.midtier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MainTransformerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainTransformerAppApplication.class, args);
    }
}
