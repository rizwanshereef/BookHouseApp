package com.stackroute.recommendationservice.exception;


@SuppressWarnings("serial")
public class RecommendationBookAlreadyExistsException extends Exception {

	public RecommendationBookAlreadyExistsException(String message) {
		super(message);
	}

}