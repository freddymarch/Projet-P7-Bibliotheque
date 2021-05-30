package org.openclassrooms.bibliotheque.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("org.openclassrooms.bibliotheque.webapp")
public class BibliothequeWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliothequeWebappApplication.class, args);
    }

}
