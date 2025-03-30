package com._prj.MovieTheatresManagement;

import com._prj.MovieTheatresManagement.models.User;
import com._prj.MovieTheatresManagement.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieTheatresManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieTheatresManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner testRepositories(UserRepository userRepository) {
        return args -> {
            // Simple test: Retrieve all users and print their usernames
            System.out.println("Testing UserRepository...");
            for (User user : userRepository.findAll()) {
                System.out.println("User: " + user.getUsername());
            }
        };
    }
}

