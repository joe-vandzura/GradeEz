package com.gradeez.gradeezapp.controllers;

import com.gradeez.gradeezapp.models.Course;
import com.gradeez.gradeezapp.repositories.CourseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseRepo courseRepo;

    @GetMapping
    public String courses(Model model) {
        Collection<Course> courses = courseRepo.findAll();
        model.addAttribute("courses", courses);
        return "courses/courses";
    }

    @GetMapping("/{id}")
    public String course(@PathVariable(name = "id") Long id, Model model) {
        Course course = courseRepo.findById(id).get();
        model.addAttribute("course", course);
        return "courses/course";
    }

}
