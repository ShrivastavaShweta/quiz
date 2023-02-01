package org.java;

public class TrueFalse extends Question{
    public TrueFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nTrue or False:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }


}
