package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;
import com._prj.MovieTheatresManagement.enums.PaymentStatus;

@Entity
@Table(name = "Payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    
    @OneToOne
    @JoinColumn(name = "bookingId")
    private Booking booking;
    
    @Column(nullable = false)
    private double amount;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus status;  // e.g., success, failed, pending
}
