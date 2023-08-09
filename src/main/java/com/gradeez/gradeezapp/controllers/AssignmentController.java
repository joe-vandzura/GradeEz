package com.gradeez.gradeezapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignments")
public class AssignmentController {

    @PostMapping
    public String showCreateAssignment() {
        return "assignments/create-assignment";
    }

    @GetMapping()
    public String showMyAssignments() {
        return "assignments/my-assignments";
    }
}
