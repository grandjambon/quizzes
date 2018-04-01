package com.pj.quizzes.maths;

public class AdditionQuestion implements Question {
    private final int a;
    private final int b;

    public AdditionQuestion(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public String getStringValue() {
        return String.format("%s + %s = ", a, b);
    }
}
