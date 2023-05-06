package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Iam in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Iam in Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
