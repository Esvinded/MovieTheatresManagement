package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Movie")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private int duration;  // Duration in minutes
    
    @Column(length = 1000)
    private String description;
}
