package com.stackroute.favouriteservice.exception;

@SuppressWarnings("serial")
public class FavouriteAlreadyExistsException extends Exception {

	public FavouriteAlreadyExistsException(String message) {
		super(message);
	}

}