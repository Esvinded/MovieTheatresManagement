package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;
import com._prj.MovieTheatresManagement.enums.BookingStatus;

@Entity
@Table(name = "Booking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;  // The user making the booking
    
    @ManyToOne
    @JoinColumn(name = "showtimeId")
    private Showtime showtime;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookingStatus status;  // e.g., pending, confirmed, canceled
}
