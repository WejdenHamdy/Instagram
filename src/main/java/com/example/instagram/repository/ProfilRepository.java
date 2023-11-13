package com.example.instagram.repository;

import com.example.instagram.model.entities.Profil;
import com.example.instagram.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil,Integer> {
}
