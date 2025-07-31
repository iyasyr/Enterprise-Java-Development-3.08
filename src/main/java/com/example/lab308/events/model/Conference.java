package com.example.lab308.events.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "conferences")
@NoArgsConstructor
@AllArgsConstructor
public class Conference extends Event {
    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;
}
