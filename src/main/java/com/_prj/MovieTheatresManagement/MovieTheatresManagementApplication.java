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
public CommandLineRunner testDatabase(UserRepository userRepository) {
    return args -> {
        try {
            System.out.println("Users in database:");
            for (User user : userRepository.findAll()) {
                System.out.println("User ID: " + user.getUserId() + " Username: " + user.getUsername());
            }
        } catch (Exception e) {
            System.err.println("Error accessing the database: " + e.getMessage());
        }
    };
}
}
