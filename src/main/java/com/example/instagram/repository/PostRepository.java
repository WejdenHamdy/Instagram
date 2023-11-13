package com.example.instagram.repository;

import com.example.instagram.model.entities.Post;
import com.example.instagram.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
