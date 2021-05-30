package org.openclassrooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BibliothequeApiRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliothequeApiRestApplication.class, args);
    }

}
