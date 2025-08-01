package edu.miu.cs.cs425.lesson_z.elibrarywebapp0;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Elibrarywebapp0Application {

    public static void main(String[] args) {
        SpringApplication.run(Elibrarywebapp0Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Hello World!");
            System.out.println("Welcome to eLibrary webapp!");
            System.out.println("For homepage, go to http://localhost:8080/");
        };
    }
}
