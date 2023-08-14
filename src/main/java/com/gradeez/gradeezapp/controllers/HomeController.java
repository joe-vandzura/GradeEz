package com.gradeez.gradeezapp.controllers;

import com.gradeez.gradeezapp.models.Course;
import com.gradeez.gradeezapp.repositories.CourseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final CourseRepo courseRepo;

    @GetMapping("/")
    public String showHome(Model model) {
        List<Course> courses = courseRepo.findAll();
        model.addAttribute("courses", courses);
        return "index";
    }

}
