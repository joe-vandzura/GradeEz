package com.gradeez.gradeezapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails joey = User.builder()
                .username("joey")
                .password("{noop}test123")
                .roles("USER", "EMPLOYEE", "MANAGER")
                .build();

        UserDetails lorena = User.builder()
                .username("lorena")
                .password("{noop}test123")
                .roles("USER", "EMPLOYEE")
                .build();

        UserDetails candy = User.builder()
                .username("candy")
                .password("{noop}test123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(joey, lorena, candy);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .anyRequest().authenticated()
        )
                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .loginProcessingUrl("/authenticate")
                                .permitAll()
                );
        return http.build();
    }

}
