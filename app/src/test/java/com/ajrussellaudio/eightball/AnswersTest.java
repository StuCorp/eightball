package com.ajrussellaudio.eightball;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnswersTest {

    ArrayList<String> testAnswers;
    Answers answers;

    @Before
    public void setUp() throws Exception {
        testAnswers = new ArrayList<>();
        testAnswers.add("Yes!");
        testAnswers.add("That would be an ecumenical matter!");
        answers = new Answers();
    }

    @Test
    public void createAnswersWithList() throws Exception {
        Answers answers = new Answers(testAnswers);
        assertEquals(2, answers.getLength());
    }

    @Test
    public void getAnswers() throws Exception {
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void setupAnswers() throws Exception {
        assertEquals(2, answers.getLength());
    }

    @Test
    public void addAnswer() throws Exception {
        int originalNumberOfAnswers = answers.getLength();
        answers.add("No.");
        assertEquals(originalNumberOfAnswers + 1, answers.getLength());
    }

    @Test
    public void getAnswerAtIndex() throws Exception {
        String result = answers.getAnswerAtIndex(0);
        assertEquals("Yes.", result);
    }

    @Test
    public void getAnswer() throws Exception {
        Answers spyAnswers = Mockito.spy(answers);
        Mockito.when(spyAnswers.getAnswer()).thenReturn("Boobs.");
        assertEquals("Boobs.", spyAnswers.getAnswer());
    }
}
