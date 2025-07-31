package com.example.lab308.events.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;

@Entity
@Table(name = "speakers")
@NoArgsConstructor
@AllArgsConstructor
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Duration presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}