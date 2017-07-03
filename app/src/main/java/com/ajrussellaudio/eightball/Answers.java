package com.ajrussellaudio.eightball;

import java.util.ArrayList;
import java.util.Random;

public class Answers {
    private ArrayList<String> answers;

    public Answers() {
        this.answers = new ArrayList<>();
        setupAnswers();
    }

    public Answers(ArrayList<String> newAnswers) {
        answers = newAnswers;
    }

    private void setupAnswers() {
        String[] answersToAdd = {
                "Yes.",
                "That would be an ecumenical matter."
        };
        for (String answer : answersToAdd) {
            answers.add(answer);
        }
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(answers);
    }

    public int getLength() {
        return answers.size();
    }

    public void add(String newAnswer) {
        answers.add(newAnswer);
    }

    public String getAnswerAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random random = new Random();
        int randomIndex = random.nextInt(getLength());
        return getAnswerAtIndex(randomIndex);
    }
}
