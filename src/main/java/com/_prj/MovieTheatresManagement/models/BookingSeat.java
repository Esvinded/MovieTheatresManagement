package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BookingSeat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingSeatId;
    
    @ManyToOne
    @JoinColumn(name = "bookingId")
    private Booking booking;
    
    @ManyToOne
    @JoinColumn(name = "seatId")
    private Seat seat;
}
