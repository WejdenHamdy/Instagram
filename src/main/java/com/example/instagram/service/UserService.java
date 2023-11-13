package com.example.instagram.service;

import com.example.instagram.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();
    UserDTO addUser(UserDTO UserDTO);
    List<UserDTO> deleteUser(Integer id);
    UserDTO findUser(Integer id);
    UserDTO updateUser(UserDTO UserDTO);

}
