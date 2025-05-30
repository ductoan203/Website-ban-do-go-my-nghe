package com.example.doan.repository;

import com.example.doan.entity.PasswordResetToken;
import com.example.doan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
    void deleteAllByUser(User user);
}
