package com.bridgelabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessageWhenSadShouldReturnSad() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();
		String actualOutput = moodanalyzer.analyzeMood("I am in sad mood");
		Assert.assertEquals("SAD", actualOutput);
	}
	
	@Test
	public void givenMessageContainAnyMoodShouldReturnHAppy() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();
		String actualOutput = moodanalyzer.analyzeMood("I am in Any Mood");
		Assert.assertEquals("HAPPY", actualOutput);
	}
	
	@Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String actualOutput = moodAnalyzer.message;
        Assert.assertEquals("SAD",actualOutput);
    }
}