package com.accenture.controller.advice;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import com.accenture.exception.EmployeeNotFoundException;
//
//@RestControllerAdvice
//public class EmployeeControllerAdvice {
//
//	@ExceptionHandler(EmployeeNotFoundException.class)
//	public ResponseEntity<ErrorResponse> handleEmployeeNotFound(EmployeeNotFoundException e)
//	{
//		ErrorResponse er = new ErrorResponse();
//		er.setMessage("Employee Not found!!");
//		er.setCode("ERR-404");
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
//	}
//	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<ErrorResponse> handleValidations(MethodArgumentNotValidException e)
//	{
//		ErrorResponse er = new ErrorResponse();
//		er.setMessage(e.getMessage());
//		er.setCode("ERR-400");
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
//	}
//}
