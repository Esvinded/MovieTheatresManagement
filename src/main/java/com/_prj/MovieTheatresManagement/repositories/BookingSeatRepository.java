package com._prj.MovieTheatresManagement.repositories;

import com._prj.MovieTheatresManagement.models.BookingSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingSeatRepository extends JpaRepository<BookingSeat, Integer> {
}
