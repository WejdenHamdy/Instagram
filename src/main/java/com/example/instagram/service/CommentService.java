package com.example.instagram.service;

import com.example.instagram.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    CommentDTO addComment(CommentDTO CommentDTO);
    List<CommentDTO> deleteComment(Integer id);
    CommentDTO updateComment(CommentDTO CommentDTO);
    
}
