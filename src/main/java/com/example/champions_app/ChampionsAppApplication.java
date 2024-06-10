package com.example.champions_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChampionsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChampionsAppApplication.class, args);
    }

}
