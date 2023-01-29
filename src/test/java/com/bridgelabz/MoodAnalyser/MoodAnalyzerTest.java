package com.bridgelabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	/* Test case to check sad mood */
	@Test
	public void givenMessageWhenSadShouldReturnSad() {
		// create object of MoodAnalyzer class
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad Mood");
		String actualOutput = moodanalyzer.analyzeMood();
		Assert.assertEquals("SAD", actualOutput);
	}

	/* Test case to check happy mood */
	@Test
	public void givenMessageWhenHappyShouldReturnHappy() {
		// create object of MoodAnalyzer
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Happy Mood");
		String actualOutput = moodanalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", actualOutput);
	}

	/* Test case to check null condition */
	@Test
	public void givenMessageWhenNullShouldReturnExceptionHandled() {
		// create object of MoodAnalyzer
		MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
		String actualOutput = moodanalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", actualOutput);
	}
}