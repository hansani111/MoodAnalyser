package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzerException extends Exception {

	public MoodAnalyzerException() {
	}

	enum Message {
		NULL, EMPTY;
	}

	public MoodAnalyzerException(Message message) {
		super();
	}
}