package org.example.lesson4.exceptions.task2.exceptions;

public class CustomerException extends Exception{
    String name;

    public CustomerException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
