package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        String mood = moodAnalyzer.analyzeMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy() {
        String mood = moodAnalyzer.analyzeMood("Iam in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
