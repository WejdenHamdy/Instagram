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
public class Comment {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idComment;
    @ManyToOne
    private User userComment;
}
