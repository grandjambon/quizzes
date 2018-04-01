package com.pj.quizzes.maths;

public class WordQuestion implements Question {

    private final String wordQuestion;

    public WordQuestion(String wordQuestion) {
        this.wordQuestion = wordQuestion;
    }

    @Override
    public String getStringValue() {
        return wordQuestion;
    }
}
