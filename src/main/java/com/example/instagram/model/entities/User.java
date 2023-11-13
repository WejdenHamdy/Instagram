package com.example.instagram.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private LocalDate  birthDate;

    @OneToMany(mappedBy="userChat")
    private List<Chat> chatList;
    @OneToMany(mappedBy="userPost")
    private List<Post> postList;
    @OneToMany(mappedBy="userComment")
    private List<Comment> commentList;
    @OneToOne
    private Profil profil;
}
