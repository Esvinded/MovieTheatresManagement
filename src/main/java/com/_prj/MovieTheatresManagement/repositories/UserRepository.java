package com._prj.MovieTheatresManagement.repositories;

import com._prj.MovieTheatresManagement.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
