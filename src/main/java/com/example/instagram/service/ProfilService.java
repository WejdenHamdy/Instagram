package com.example.instagram.service;

import com.example.instagram.dto.ProfilDTO;

import java.util.List;

public interface ProfilService {
    ProfilDTO ConsultProfil(Integer id);
    ProfilDTO updateProfil(ProfilDTO ProfilDTO);
}
