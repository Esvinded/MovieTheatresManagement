package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Showtime")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Showtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showtimeId;
    
    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;
    
    @ManyToOne
    @JoinColumn(name = "screenId")
    private Screen screen;
    
    @Column(nullable = false)
    private LocalDateTime startTime;
    
    @Column(nullable = false)
    private LocalDateTime endTime;
}
