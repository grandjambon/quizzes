package com.pj.quizzes.springboot;

import com.pj.quizzes.literacy.SpellingList;
import com.pj.quizzes.maths.MathsQuestions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("unused")
@Configuration
public class QuizzesConfiguration {

    @Bean
    public SpellingList spellingList() {
        return new SpellingList();
    }

    @Bean
    public MathsQuestions mathsQuestions() {
        return new MathsQuestions();
    }
}
