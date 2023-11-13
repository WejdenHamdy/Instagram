package com.example.instagram.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idChat;
    private String contenuMessage;
    private File attachment;
    @ManyToOne
    private User userChat;


}
