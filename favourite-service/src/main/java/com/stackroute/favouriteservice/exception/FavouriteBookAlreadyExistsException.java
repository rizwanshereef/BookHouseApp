package com.stackroute.favouriteservice.exception;

@SuppressWarnings("serial")
public class FavouriteBookAlreadyExistsException extends Exception {

	public FavouriteBookAlreadyExistsException(String message) {
		super(message);
	}

}