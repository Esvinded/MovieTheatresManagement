package com._prj.MovieTheatresManagement.repositories;

import com._prj.MovieTheatresManagement.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
