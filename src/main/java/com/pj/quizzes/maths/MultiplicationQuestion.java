package com.pj.quizzes.maths;

import static java.lang.String.format;

public class MultiplicationQuestion implements Question {
    private final int a;
    private final int b;

    public MultiplicationQuestion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getStringValue() {
        return format("%s x %s = ", a, b);
    }
}
