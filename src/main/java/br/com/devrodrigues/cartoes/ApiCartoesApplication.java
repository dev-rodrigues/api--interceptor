package br.com.devrodrigues.cartoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApiCartoesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiCartoesApplication.class, args);
    }
}
