package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer {

	String message;

	/* Parameterized constructor */
	public MoodAnalyzer(String message) {
		this.message = analyzeMood(message);
	}

	/* Default constructor */
	public MoodAnalyzer() {
	}

	/* This method will return Mood(HAPPY/SAD) */
	public String analyzeMood(String message) {
		if (message.toLowerCase().contains("sad"))
			message = "SAD";
		else
			message = "HAPPY";
		return message;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyzer");
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

		System.out.println("Mood is " + moodAnalyzer.analyzeMood("I'm in Sad mood!!!"));
		System.out.println("Mood is " + moodAnalyzer.analyzeMood("I'm happy!!!"));
	}
}