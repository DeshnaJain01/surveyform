package com.example.surveyform.exception;

public class SurveyFormNotFoundException extends RuntimeException{

    public SurveyFormNotFoundException(String message) {
        super(message);
    }

    public SurveyFormNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
