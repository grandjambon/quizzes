package com.pj.quizzes.literacy;

public class Letter {
    private final String letter;
    private final String word;

    public Letter(String letter, String word) {
        this.letter = letter;
        this.word = word;
    }

    public String getLetter() {
        return letter;
    }

    public String getWord() {
        return word;
    }
}
