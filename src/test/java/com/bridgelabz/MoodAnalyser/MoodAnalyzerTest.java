package com.bridgelabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	/* Test case to check sad mood */
	@Test
	public void givenMessageWhenSadShouldReturnSad() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();

		moodanalyzer.message = "I am in Sad Mood";
		String actualOutput;
		try {
			actualOutput = moodanalyzer.analyzeMood();
			Assert.assertEquals("SAD", actualOutput);
		} catch (MoodAnalyzerException e) {

		}
	}

	/* Test case to check happy mood */
	@Test
	public void givenMessageWhenHappyShouldReturnHappy() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Happy Mood");

		String actualOutput;
		try {
			actualOutput = moodanalyzer.analyzeMood();
			Assert.assertEquals("HAPPY", actualOutput);
		} catch (MoodAnalyzerException e) {
		}
	}

	/* Test case to check null condition */
	@Test
	public void givenMessageWhenNullShouldReturnException() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
		try {
			String actualOutput = moodanalyzer.analyzeMood();
			Assert.assertEquals("EMPTY MOOD", actualOutput);
		} catch (MoodAnalyzerException e) {

		}
	}
}