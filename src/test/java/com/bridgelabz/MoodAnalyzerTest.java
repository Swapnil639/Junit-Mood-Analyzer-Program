package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmptyMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            System.out.println(e.getMessage());
        }
    }
}
