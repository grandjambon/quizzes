package com.pj.quizzes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"com.pj.quizzes.springboot"})
public class QuizzesWarWebApp extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(QuizzesWarWebApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(QuizzesWarWebApp.class, args);
    }
}
