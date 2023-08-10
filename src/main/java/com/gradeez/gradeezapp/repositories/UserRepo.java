package com.gradeez.gradeezapp.repositories;

import com.gradeez.gradeezapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

}
