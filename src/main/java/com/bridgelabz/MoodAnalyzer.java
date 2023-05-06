package com.bridgelabz;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        if (message.contains("Iam in Sad Mood"))
            return "SAD";
        else
            return "HAPPY";
    }
}
