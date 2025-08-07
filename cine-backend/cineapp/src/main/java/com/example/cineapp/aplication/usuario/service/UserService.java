package com.example.cineapp.aplication.usuario.service;

import com.example.cineapp.domain.usuario.model.User;
import com.example.cineapp.domain.usuario.repository.UserRepository;
import com.example.cineapp.interfaces.usuario.dto.RegisterDTO;

import java.util.List;

public interface UserService {
    User registerUser(RegisterDTO dto);
    User registerUser(RegisterDTO dto, boolean forceSuperUser);
    List<User> getAllUsers();
    User getUser(Long id);
    User updateUser(Long id, RegisterDTO dto);
    void logicalDelete(Long id);
}
