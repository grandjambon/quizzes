package com.pj.quizzes.literacy;

public enum KeyStage {
    KS1("ks1"),KS2("ks2");

    private final String directory;

    KeyStage(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }
}
