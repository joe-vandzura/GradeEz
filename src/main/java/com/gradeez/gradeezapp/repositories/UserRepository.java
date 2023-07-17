package com.gradeez.gradeezapp.repositories;

import com.gradeez.gradeezapp.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}