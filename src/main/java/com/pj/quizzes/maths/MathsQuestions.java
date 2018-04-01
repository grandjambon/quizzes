package com.pj.quizzes.maths;

import java.util.*;

public class MathsQuestions {

    private int[] timesTables = {2, 3, 4, 5, 6, 10};

    public Collection<Question> getQuestions(int addition, int subtraction, int multiplcation, int word) {
        List<Question> questions = new ArrayList<>();
        for (int i=0; i<addition; i++) {
            questions.add(createAdditionQuestion());
        }
        for (int i=0; i<subtraction; i++) {
            questions.add(createSubtractionQuestion());
        }
        for (int i=0; i<multiplcation; i++) {
            questions.add(createMultiplicationQuestion());
        }
        for (int i=0; i<word; i++) {
            questions.add(createWordQuestion());
        }

        // shuffle
        Collections.shuffle(questions);

        return questions;
    }

    /**
     *
     * @return AdditionQuestion
     */
    private Question createAdditionQuestion() {
        return new AdditionQuestion(getRandom(10)+10, getRandom(10)+10);
    }

    private Question createMultiplicationQuestion() {
        return new MultiplicationQuestion(getTimesTable(), getRandom(10));
    }

    private int getTimesTable() {
        Random rand = new Random();
        return timesTables[rand.nextInt(timesTables.length - 1)];
    }

    private Question createSubtractionQuestion() {
        int a = getRandom(20);
        int b = getRandom(10);
        return new SubtractionQuestion(Math.max(a, b), Math.min(a,b));
    }

    private Question createWordQuestion() {
        Random rand = new Random();

        // gets 0-4
        int i = rand.nextInt(4);
        switch (i) {
            case 0:
                return WordQuestionFactory.half(getRandom(10));
            case 1:
                return WordQuestionFactory.quarter(getRandom(10));
            case 2:
                return WordQuestionFactory.lotsOf(getTimesTable(), getRandom(11));
            case 3:
                return WordQuestionFactory.shared(getTimesTable(), getRandom(4)+1);
            default:
                throw new IllegalArgumentException("random number generated not between 1 and 4: " + i);
        }
    }

    private int getRandom(int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound) + 1;
    }
}
