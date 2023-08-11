package com.example.surveyform.exception;

import org.springframework.http.HttpStatus;


public class SurveyFormException {
    private final String message;
    private final Throwable throwable;

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    private final HttpStatus httpStatus;

    public SurveyFormException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }
}
