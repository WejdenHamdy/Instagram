package com.example.instagram.repository;

import com.example.instagram.model.entities.Comment;
import com.example.instagram.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
