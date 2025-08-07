package com.example.cineapp.domain.usuario.repository;

import com.example.cineapp.domain.usuario.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);
    User save(User user);
    Optional<User> findById(Long id);
    void delete(User user);
    List<User> findAll();
}


