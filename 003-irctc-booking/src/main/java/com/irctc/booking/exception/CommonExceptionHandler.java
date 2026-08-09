package com.irctc.booking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.irctc.booking.response.ErrorResponse;

@RestControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<ErrorResponse> handleInsufficientBalanceException(InsufficientBalanceException balanceException) {
		
		// this block executed if InsufficientBalanceException
		
		ErrorResponse response = new ErrorResponse("ER-200", balanceException.getMessage());
//		return ResponseEntity.status(HttpStatus.OK).body(balanceException.getMessage());
				
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@ExceptionHandler(Exception.class)
	public void handleException(Exception exe) {
		
		// this block executed if Exception
	}
}
