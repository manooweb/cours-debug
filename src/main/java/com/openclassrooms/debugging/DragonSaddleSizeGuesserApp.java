package com.openclassrooms.debugging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DragonSaddleSizeGuesserApp {

    public static void main(String[] args) {
        SpringApplication.run(DragonSaddleSizeGuesserApp.class);
    }

    @Bean
    HttpExchangeRepository httpExchangeRepository() {
        return new InMemoryHttpExchangeRepository();
    }

}
