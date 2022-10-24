package com.example.spring2pr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Spring2PrApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring2PrApplication.class, args);
    }

}
