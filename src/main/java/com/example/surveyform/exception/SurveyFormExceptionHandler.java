package com.example.surveyform.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SurveyFormExceptionHandler {

 @ExceptionHandler(value={SurveyFormNotFoundException.class})
 public ResponseEntity<Object> handleSurveyFormNotFoundException
         (SurveyFormNotFoundException surveyFormNotFoundException)
 {
     SurveyFormException surveyFormException=new SurveyFormException(
             surveyFormNotFoundException.getMessage(),
             surveyFormNotFoundException.getCause(),
             HttpStatus.NOT_FOUND
     );
     return new ResponseEntity<>(surveyFormException,HttpStatus.NOT_FOUND);
 }
}
