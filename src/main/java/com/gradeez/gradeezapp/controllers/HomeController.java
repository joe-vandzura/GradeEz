package com.gradeez.gradeezapp.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

//    @GetMapping("/")
//    public String loginPage() {
//        return "index";
//    }

    @GetMapping
    public OAuth2User returnToken(OAuth2AuthenticationToken token) {
        return token.getPrincipal();
    }

}
