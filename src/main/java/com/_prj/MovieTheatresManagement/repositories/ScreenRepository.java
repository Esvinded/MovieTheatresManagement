package com._prj.MovieTheatresManagement.repositories;

import com._prj.MovieTheatresManagement.models.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer> {
}
