package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer {

	public String analyzeMood(String message) {
		if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else
			return "HAPPY";
	}

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

		System.out.println(moodAnalyzer.analyzeMood("I'm in Sad mood!!"));
		System.out.println(moodAnalyzer.analyzeMood("I'm Happy mood!!"));
	}
}