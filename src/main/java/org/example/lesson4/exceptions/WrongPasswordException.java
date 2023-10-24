package org.example.lesson4.exceptions;

public class WrongPasswordException extends Exception{
    String message;

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }
}
