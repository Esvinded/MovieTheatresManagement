package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Screen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int screenId;
    
    @Column(nullable = false)
    private int screenNumber;
    
    @Column(nullable = false)
    private int capacity;
    
    @ManyToOne
    @JoinColumn(name = "theatreId")
    private Theatre theatre;
}
