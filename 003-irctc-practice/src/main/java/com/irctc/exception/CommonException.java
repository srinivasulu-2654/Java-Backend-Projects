package com.irctc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonException {
	
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<String> handleInsufficientBalanceException(InsufficientBalanceException exe){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exe.getMessage());
	}
}
