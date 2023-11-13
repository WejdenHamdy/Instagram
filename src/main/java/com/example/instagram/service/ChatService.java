package com.example.instagram.service;

import com.example.instagram.dto.ChatDTO;

import java.util.List;

public interface ChatService {
    ChatDTO addChat(ChatDTO ChatDTO);
    List<ChatDTO> deleteChat(Integer id);
    ChatDTO findChat(Integer id);
    ChatDTO updateChat(ChatDTO ChatDTO);
}
