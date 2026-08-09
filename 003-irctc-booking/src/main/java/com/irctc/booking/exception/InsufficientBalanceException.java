package com.irctc.booking.exception;

public class InsufficientBalanceException extends RuntimeException{
	
	public InsufficientBalanceException(String _message) {
		super(_message);
	}
}
