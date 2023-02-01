package org.java;

public class Checkbox extends Question{
    public Checkbox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nChoose one or more:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }
}
