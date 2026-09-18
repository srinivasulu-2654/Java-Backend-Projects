package com.revision.exception1;

public class UserCreationFailedException extends RuntimeException{
	
	public UserCreationFailedException(String message) {
		super(message);
	}
}
