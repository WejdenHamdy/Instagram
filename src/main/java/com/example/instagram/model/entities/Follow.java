package com.example.instagram.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Follow {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFollow;
    @ManyToOne
    private User follower; // The user following
    @ManyToOne
    private User following; // The user being followed



}
