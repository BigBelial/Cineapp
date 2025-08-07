package com.example.cineapp.infraestructure.usuario.persistence;

import com.example.cineapp.domain.usuario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface JpaUserRepository extends  JpaRepository <User, Long> {
    Optional<User> findByEmail(String email);
}
