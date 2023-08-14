package com.gradeez.gradeezapp.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHome(OAuth2AuthenticationToken token) {
        System.out.println(token);
        return "index";
    }

}
