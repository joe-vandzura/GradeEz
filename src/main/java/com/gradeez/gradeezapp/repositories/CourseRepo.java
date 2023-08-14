package com.gradeez.gradeezapp.repositories;

import com.gradeez.gradeezapp.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {



}
