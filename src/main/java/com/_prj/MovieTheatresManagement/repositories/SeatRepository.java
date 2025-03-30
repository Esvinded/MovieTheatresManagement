package com._prj.MovieTheatresManagement.repositories;

import com._prj.MovieTheatresManagement.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
