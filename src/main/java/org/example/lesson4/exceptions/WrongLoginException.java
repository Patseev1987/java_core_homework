package org.example.lesson4.exceptions;

public class WrongLoginException extends Exception{
    String message;

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
