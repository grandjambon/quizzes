package com.pj.quizzes.maths;

public class WordQuestionFactory {

    public static WordQuestion half(int answer) {
        return new WordQuestion(String.format("What is half of %s?", answer*2));
    }

    public static WordQuestion quarter(int answer) {
        return new WordQuestion(String.format("What is quarter of %s?", answer*4));
    }

    public static WordQuestion shared(int answer, int between) {
        return new WordQuestion(String.format("What is %s shared between %s?", answer*between, between));
    }

    public static WordQuestion lotsOf(int a, int b) {
        return new WordQuestion(String.format("What is %s lots of %s?", a, b));
    }
}
