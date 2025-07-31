package com.example.lab308.events.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "expositions")
@NoArgsConstructor
public class Exposition extends Event {
    // No additional fields required
}