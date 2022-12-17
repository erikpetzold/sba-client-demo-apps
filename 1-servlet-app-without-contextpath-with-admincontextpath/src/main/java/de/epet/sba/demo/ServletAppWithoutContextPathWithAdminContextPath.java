package de.epet.sba.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServletAppWithoutContextPathWithAdminContextPath {

    public static void main(String[] args) {
        SpringApplication.run(ServletAppWithoutContextPathWithAdminContextPath.class, args);
    }
}
