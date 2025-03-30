package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Seat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatId;
    
    @Column(nullable = false)
    private int number;  // Seat number (e.g., 1, 2, 3...)
    
    @Column(nullable = false)
    private String row_letter;  // Use String to allow for letters A-Z (or even AA, AB, etc.)
    
    @ManyToOne
    @JoinColumn(name = "screenId")
    private Screen screen;
}
