package org.java;

import java.util.ArrayList;
import java.util.HashMap;

public class MultipleChoiceQuestions extends Question {

    public MultipleChoiceQuestions(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nMultiple Choice:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }
}

