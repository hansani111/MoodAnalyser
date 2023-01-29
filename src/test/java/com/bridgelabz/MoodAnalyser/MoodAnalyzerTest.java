package com.bridgelabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessageWhenSadShouldReturnSad() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();

		moodanalyzer.message = "I am in sad mood";
		String actualOutput = moodanalyzer.analyzeMood();
		Assert.assertEquals("SAD", actualOutput);
	}

	@Test
	public void givenMessageContainAnyMoodShouldReturnHAppy() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();

		moodanalyzer.message = "I am in Any Mood";
		String actualOutput = moodanalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", actualOutput);
	}

	@Test
	public void givenMessage_WhenNull_ShouldReturnSAD() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");

		String actualOutput = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD", actualOutput);
	}

	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");

		String actualOutput = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", actualOutput);
	}
}