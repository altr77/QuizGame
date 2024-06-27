package com.example.demo2;

public class Question {
    private String questionText;
    private String[] options;
    private final int correctOption;

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean isCorrect(int choice) {
        return choice == correctOption;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}
