package de.epet.sba.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxAppWithoutContextPath {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxAppWithoutContextPath.class, args);
    }
}
