package com.example.assignment_three_starter.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
@EnableWebSecurity
@EntityScan("com.example.assignment_three_starter.model")
public class AssignmentThreeStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentThreeStarterApplication.class, args);
    }

}
