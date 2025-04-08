package com.myProject.tripease.exception;

public class DriverNotFoundException extends RuntimeException {

    public DriverNotFoundException(String message){
        super(message);
    }
}
