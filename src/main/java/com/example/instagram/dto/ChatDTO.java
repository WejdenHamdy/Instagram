package com.example.instagram.dto;

import jakarta.validation.constraints.NotBlank;

import java.io.File;

public class ChatDTO {
    private Integer idChat;
    @NotBlank(message = "contenuMessage is mandatory")
    private String contenuMessage;
    @NotBlank(message = "attachment is mandatory")
    private File attachment;
}
