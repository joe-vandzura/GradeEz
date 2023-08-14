package com.gradeez.gradeezapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/", true)
//                .permitAll()
//                .failureUrl("/login")
//                .and()
//                .authorizeHttpRequests(configurer -> {
//                    configurer.requestMatchers("/").permitAll();
//                    configurer.requestMatchers("/assignments/**").hasRole("TEACHER").anyRequest().authenticated();
//                })
//                .oauth2Login(withDefaults())
////                .csrf(c -> c
////                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
////                )
//                .logout(l -> l
//                        .logoutSuccessUrl("/").permitAll()
//                )
//                .build();
//    }
//
//}
