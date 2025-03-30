package com._prj.MovieTheatresManagement.services;

import com._prj.MovieTheatresManagement.models.User;
import com._prj.MovieTheatresManagement.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor injection is the preferred method
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Retrieve a user by their ID
    public Optional<User> getUserById(int userId) {
        return userRepository.findById(userId);
    }

    // Save or update a user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Delete a user by ID
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
