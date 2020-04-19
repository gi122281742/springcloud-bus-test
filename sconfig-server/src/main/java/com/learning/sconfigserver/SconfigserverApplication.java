package com.learning.sconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SconfigserverApplication.class, args);
    }

}
