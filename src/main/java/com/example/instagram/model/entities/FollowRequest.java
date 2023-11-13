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

public class FollowRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer requestId;
    @ManyToOne
    private User requester; // The user sending the follow request
    @ManyToOne
    private User receiver; // The user receiving the follow request

}
