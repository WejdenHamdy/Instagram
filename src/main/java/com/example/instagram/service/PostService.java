package com.example.instagram.service;

import com.example.instagram.dto.PostDTO;

import java.util.List;

public interface PostService {
    List<PostDTO> getPosts();
    PostDTO addPost(PostDTO PostDTO);
    List<PostDTO> deletePost(Integer id);
    PostDTO findPost(Integer id);
    PostDTO updatePost(PostDTO PostDTO);
}
