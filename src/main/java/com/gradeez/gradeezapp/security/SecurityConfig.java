package com.gradeez.gradeezapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(configurer -> {
                    configurer.requestMatchers("/").authenticated();
                    configurer.requestMatchers("/assignments/**").hasRole("TEACHER").anyRequest().authenticated();
                })
                .oauth2Login(withDefaults())
                .logout().invalidateHttpSession(true).clearAuthentication(true).logoutSuccessUrl("/login?logout")
                .and().build();
    }

}
