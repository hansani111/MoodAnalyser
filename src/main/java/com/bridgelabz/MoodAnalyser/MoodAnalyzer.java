package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer {
	String message;

	/* Parameterized constructor */
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	/* Default constructor */
	public MoodAnalyzer() {
	}

	/*
	 * this method will return Mood(HAPPY/SAD) according to the string given to
	 * message
	 */
	public String analyzeMood() {
		try {
			if (message.toLowerCase().contains("sad"))
				message = "SAD";
			else if (message.toLowerCase().contains("happy"))
				message = "HAPPY";
			else
				message = "HAPPY";

			return message;
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

		System.out.println(moodAnalyzer.analyzeMood());

		moodAnalyzer.message = "I'm in Sad mood!!!";
		System.out.println(moodAnalyzer.analyzeMood());

		moodAnalyzer.message = "I'm happy!!!";
		System.out.println(moodAnalyzer.analyzeMood());

		moodAnalyzer.message = "";
		System.out.println(moodAnalyzer.analyzeMood());
	}
}