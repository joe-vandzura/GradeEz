package com.gradeez.gradeezapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gradeez.gradeezapp.models.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {



}
