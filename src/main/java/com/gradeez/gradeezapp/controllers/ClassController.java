package com.gradeez.gradeezapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classes")
public class ClassController {

    @GetMapping

    @PostMapping
    public String createClass() {
        return "";
    }

}
