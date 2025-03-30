package com._prj.MovieTheatresManagement.repositories;

import com._prj.MovieTheatresManagement.models.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime, Integer> {
}