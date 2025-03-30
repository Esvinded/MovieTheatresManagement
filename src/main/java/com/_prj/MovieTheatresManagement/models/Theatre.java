package com._prj.MovieTheatresManagement.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Theatre")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theatreId;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String location;
    
    @Column(nullable = false)
    private int totalScreens;
}
