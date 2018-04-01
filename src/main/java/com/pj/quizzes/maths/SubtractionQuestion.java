package com.pj.quizzes.maths;

import static java.lang.String.format;

public class SubtractionQuestion implements Question {
    private final int a;
    private final int b;

    public SubtractionQuestion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getStringValue() {
        return format("%s - %s = ", a, b);
    }
}
