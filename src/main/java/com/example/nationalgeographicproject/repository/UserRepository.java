package com.example.nationalgeographicproject.repository;

import com.example.nationalgeographicproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsernameIgnoreCaseOrEmailIgnoreCase(String username, String email);

    Optional<User> findUserByUsernameIgnoreCase(String username);

    Optional<User> findUserByEmailIgnoreCase(String email);

    boolean existsUserByUsernameIgnoreCase(String username);
    boolean existsUserByEmailIgnoreCase(String email);
}
