package com.example.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
        loadQuestions();
    }

    // Load questions into the quiz
    private void loadQuestions() {
        questions.add(new Question("Who is the developer of java ?",
                new String[]{"1. James Gosling", "2. Albert Einstein", "3. Berlin", "4.Lagertha "}, 1));
        questions.add(new Question("Which planet is known as the Red Planet?",
                new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}, 2));
        questions.add(new Question("Who wrote 'Think and Grow Rich '?",
                new String[]{"1. Harper Lee", "2. Mark Twain", "3. J.K. Rowling", "4. Napoleon Hill"}, 4));
        // Add more questions as needed
    }

    // Run the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            if (question.isCorrect(choice)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + question.getCorrectOption());
            }
            System.out.println();
        }
        System.out.println("Quiz Over! Your final score is " + score + " out of " + questions.size());
        scanner.close();
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.start();
    }
}
